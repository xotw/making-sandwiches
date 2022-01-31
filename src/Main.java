import java.util.*;

public class Main {


    public static void main(String[] args){
        StringAlgorithms sA = new StringAlgorithms();
        ArrayAlgorithms aA = new ArrayAlgorithms();

//        List<Integer> dbTest1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 100, 200, 500, 999);
//
//        List<Integer> dbTest2 = Arrays.asList(-3, 3, 5, 6, 700);
//
//        List<Integer> dbTest3 = Arrays.asList(1, 3, 5, 6, 1700);
//
//        System.out.println(dTest.numBST(dbTest1));
//        System.out.println();

//        System.out.println(dTest.numBST(dbTest2));
//        System.out.println();
//
//        System.out.println(dTest.numBST(dbTest3));

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

//
//        int[] array = {1, 4, 6, 8, 9, 12, 16, 35, 57, 63, 71, 77, 86, 90};
//
//        System.out.println();
////
//        int index = Arrays.binarySearch(array, 86);
//        System.out.println(array[index]);
////
//        System.out.println();
//
//        aA.reverseInPlace(array);
//        Arrays.stream(array).forEach(System.out::println);
//        System.out.println(Arrays.toString(array));

//        int[] testArr = {1, 2, 3, 4, 5, 6};
//
//        aA.moveLeft(testArr);
//        System.out.println();
//        System.out.println(Arrays.toString(testArr));
//
//
//        int[] testArr2 = {7, 8, 9, 10, 11};
//
//        aA.moveRight(testArr2);
//        System.out.println();
//        System.out.println(Arrays.toString(testArr2));
//
//
//        CustomLinkedList linkedList = new CustomLinkedList();
//
//        Node firstNode = new Node(3);
//        Node secondNode = new Node(4);
//        Node thirdNode = new Node(5);
//        Node fourthNode = new Node(6);
//
//        linkedList.head = firstNode;
//        firstNode.next = secondNode;
//        secondNode.next = thirdNode;
//        thirdNode.next = fourthNode;
//
//        linkedList.displayContents();
//        linkedList.deleteBackHalf();
//        linkedList.displayContents();

        int[] array = {1, 2, 3};

        Stack<Integer> stack = new Stack<>();
        stack.push(array[0]);

        System.out.println(stack);











    }
}
