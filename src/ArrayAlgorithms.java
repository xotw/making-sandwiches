import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class ArrayAlgorithms {

    public ArrayAlgorithms() {
    }

       // LINEAR SEARCH //

    public boolean linearSearch(int[] arr, int item) {
        for (int current : arr) {
            if (current == item) {
                return true;
            }
        }
        return false;
    }

//    An optional acts as a container object to help prevent null exceptions.
//    In our case, if the array contains the number, then the optional will contain the item.
//    If the array does not contain the item, the optional will be empty.
//    Previously we had an algorithm that returned null. If you have plain null values scattered
//    throughout your program, you might forget to do a null check and end up with a null pointer exception.
//    This new implementation prevents this because you have to unbox the value before using it.

    public OptionalInt linearSearch2(int[] arr, int item) {
        return Arrays.stream(arr).filter(x -> x == item).findFirst();
    }

    // BINARY SEARCH //
    // this type of search assumes that we are dealing with a sorted array //
    //  To, keep things simple, we'll return a boolean that's true or false depending on whether the item exists.
    //  Now for the implementation. The first step is to create variables for our min and max indices.
    //  This will help us bucket the inner array we're searching through. To start, that's the full array,
    //  so we'll start the min at zero and the max will be the length of the array minus one, the last index.
    //  We'll want to continue searching through the array until the min is greater than the max.
    //  If the min is greater than the max, then the inner array we're searching through is empty and the item
    //  must not exist in the array. Let's create a while loop, and while the min is less than or equal to the max,
    //  we'll continue to search for the item. If we don't find the item in the loop, we'll return false,
    //  because the item must not exist in the array. In the while loop, we'll create a midpoint using the min and max
    //  so we can start our search. We can calculate the midpoint by adding the min and max and then dividing by two.
    //  Then we'll check whether the item is at the midpoint of the array, this inner array. If it is, we've found the
    //  items, so we can just return true. Otherwise, we'll need to search through a sub-array of this inner array.
    //  We can determine where to continue our search by checking whether the item we're searching for is less than the
    //  item at the midpoint. If this happens to be the case, we need to search through the front half of the array.
    //  We can do this by setting max equal to the midpoint minis one. if the item we're searching for is greater than
    //  the item at the midpoint, then we need to search through the back half of the inner array. This means
    //  we'll need to bump up the minimum to the midpoint plus one. And that's our implementation, we're done!

    public boolean binarySearch(int[] arr, int item) {
        int min = 0;
        int max = arr.length - 1;

        while(min <= max) {
            int mid = (min + max) / 2;
            if (item == arr[mid]) {
                return true;
            } else if (item < arr[mid]){
                max = mid - 1;
            } else {
                min = mid+ 1;
            }
        }
        return false;
    }

    // AGGREGATE AND FILTER ARRAYS //
    public int[] findEvenNums(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr1) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        for (int num : arr2) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] findEvenNums2(int[] arr1, int[] arr2) {

        IntPredicate isEvenPred = num -> num % 2 == 0;
        return Stream.of(arr1, arr2)
                .flatMapToInt(Arrays::stream)
                .filter(isEvenPred)
                .toArray();
    }

    // REVERSE ARRAYS //

    public int[] reverse(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public void reverseInPlace(int[] arr) {
        for(int i = 0; i < arr.length / 2; i++) {
            // Swap item at index (i) and
            // item at index (arr.length - 1 - i)
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public void moveLeft(int[] arr) {
        int temp = arr[0];
        for(int i = 0; i < arr.length - 1; i++) {
            //[2, 3, 4, 5, 6, 6] instead of [2, 3, 4, 5, 6, 1]
                arr[i] = arr[i + 1];
            }
        arr[arr.length - 1] = temp;
    }

    public void moveRight(int[] arr) {
        int temp = arr[arr.length - 1];
        for(int i = arr.length - 1; i > 0; i--) {
            //[2, 3, 4, 5, 6, 6]
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
}
