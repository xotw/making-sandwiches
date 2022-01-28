import java.util.Arrays;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args){
        StringAlgorithms sA = new StringAlgorithms();
        ArrayAlgorithms aA = new ArrayAlgorithms();

//        System.out.println((sA.normalizeString(("   Hello Alexia, How is it going ,?"))));
//
//        String s = "This is awesome";
//
//        sA.parseContents(s);
//
//        System.out.println();
//
//        System.out.println(sA.isAtEvenIndex(s, 'H'));
//        System.out.println(sA.isAtEvenIndex(s, 'o'));
//        System.out.println(sA.isAtEvenIndex(s, 'i'));
//        System.out.println(sA.isAtEvenIndex(null, 'x'));
//        System.out.println(sA.isAtEvenIndex(s, 's'));
//
//        System.out.println();
//
//        System.out.println(sA.reverse(null));
//        System.out.println(sA.reverse(s));
//        System.out.println(sA.reverse2("Gabriel"));
//        System.out.println(sA.reverse2(null));
//
//        System.out.println();
//
//        System.out.println(sA.reverseEachWord(s));


//        int[] array = {1, 4, 6, 8, 9, 12, 16, 35, 57, 63, 71, 77, 86, 90};
//
//        System.out.println();
//
//        int index = Arrays.binarySearch(array, 86);
//        System.out.println(array[index]);
//
//        System.out.println();
//
//        aA.reverseInPlace(array);
//        Arrays.stream(array).forEach(System.out::println);
//        System.out.println(Arrays.toString(array));

        int[] testArr = {1, 2, 3, 4, 5, 6};

        aA.moveLeft(testArr);
        System.out.println();
        System.out.println(Arrays.toString(testArr));


        int[] testArr2 = {7, 8, 9, 10, 11};

        aA.moveRight(testArr2);
        System.out.println();
        System.out.println(Arrays.toString(testArr2));


        CustomLinkedList linkedList = new CustomLinkedList();

        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(6);

        linkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        linkedList.displayContents();
        linkedList.deleteBackHalf();
        linkedList.displayContents();









    }
}
