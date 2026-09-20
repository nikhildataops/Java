import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class DequeStack {
    static void main(String[] args) {
        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(56);
        stack.push(78);
        stack.push(89);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

    }
}
