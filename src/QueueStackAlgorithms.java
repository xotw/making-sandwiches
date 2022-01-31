import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class QueueStackAlgorithms {


    public QueueStackAlgorithms() {
    }

    // Queues follow a First in, First out (FIFO) mechanism //
    public void printNBinaryNumbers(int n) {
        if (n <= 0) {
            System.out.println();
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        for (int i = 0; i < n; i++) {
            int current = queue.remove();
            System.out.println(current);

            queue.add(current * 10);
            queue.add(current * 10 + 1);
        }

        System.out.println();
    }

    // Stacks follow a Last in, First out (LIFO) mechanism //

    public void printNextGreaterElement(int[] array) {
        if (array.length == 0) {
            System.out.println();
            return;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(array[0]);

        for (int i = 1; i < array.length; i++) {
            int next = array[i];
            if(!stack.isEmpty()) {
                int popped = stack.pop();
                while (popped < next) {
                    System.out.println(popped + " --> " + next);
                    if (stack.isEmpty()) {
                        break;
                    }
                    popped = stack.pop();
                }

                if (popped > next) {
                    stack.push((popped));
                }
            }
            stack.push(next);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " --> " + -1);
        }
    }




}
