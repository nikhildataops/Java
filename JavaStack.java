import java.util.Stack;
import java.util.Vector;

public class JavaStack {
    static void main(String[] args) {
        Stack<Integer> list=new Stack<>();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(40);
        System.out.println("Printing the LinkedList: "+list);
        System.out.println(list.indexOf(40));
        System.out.println((list.lastIndexOf(40)));

        //addFirst and addLast
        System.out.println("Printing the LinkedList: "+list);
        list.remove(3);
        list.remove(3);
        System.out.println("Printing the LinkedList: "+list);
        System.out.println(list.size());
        System.out.println(list.contains(34));
        System.out.println(list.get(2));
        System.out.println(list);
        list.set(0,57);
        System.out.println(list);
        //Specific Methods
        System.out.println(" before:stack: "+list);
        list.push(34);
        list.push(56);
        System.out.println(list);
        list.pop();
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list.search(40));
        System.out.println(list.empty());


    }
}
