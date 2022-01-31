public class CustomLinkedList {

    Node head;

    public CustomLinkedList() {
    }

    public void displayContents() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteBackHalf() {

        if (head == null || head.next == null){
            head = null;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        prev.next = null;

    }






    public void deleteKthNode(int k) {
        if (head == null || head.next == null){
            head = null;
        }


        // Let's say the list is A, B, C, and D, and K equals two.
        // list = [a, b, c, d]; k = 2

        // The first and second references start at the head, so A.
        // When we increment the second node, it will stop at C.
        // This is the Kth node, or the second node from the head node.

        Node first = head; // a
        Node second = head; // a

        for(int i = 0; i < k; i++) {
            second = second.next;
            if(second.next == null) {
                // K >= length of list
                if (i == k - 1) {
                    head = head.next;
                }
                return;
            }
        }

        // To find the Kth node from the end of the list, we increment both the first
        // and second pointers at the same time until the second pointer reaches the last element.
        // In this case, that's a single iteration. First, we'll move to B, and second, we'll move to D.

        //second = c
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }


        // Now, first.next is the node we want to get rid of, the C element,
        // since it's the second item from the end of the list.
        // We can remove it by setting first.next equal to first.next.next.
        // We can do this without worrying about null pointer exceptions,
        // because we know first is earlier in the list than second.
        // When we set first.next to first.next.next, we skip over the C element by
        // setting first.next equal to D. That's it for the implementation.

        // first = b
        // second = d

        first.next = first.next.next;

    }





}
