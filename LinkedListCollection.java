import java.util.LinkedList;

public class LinkedListCollection {
    static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
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
        list.addFirst(101);
        list.addLast(102);
        System.out.println("Printing the LinkedList: "+list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list.offer(20));
        System.out.println(list);

    }
}
