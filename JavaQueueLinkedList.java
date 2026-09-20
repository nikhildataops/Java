import java.util.Deque;
import java.util.LinkedList;

public class JavaQueueLinkedList {
    static void main(String[] args) {
        Deque<Integer> queue=new LinkedList<>();
        queue.offer(56);
        queue.offer(98);
        queue.add(76);
        queue.add(30);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        queue.addFirst(76);
        System.out.println(queue);
    }
}
