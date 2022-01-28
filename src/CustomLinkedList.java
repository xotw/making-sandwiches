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

        Node first = head;
        Node second = head;

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

    }





}
