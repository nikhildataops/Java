import java.util.LinkedList;
import java.util.Vector;

public class JavaVector {
    static void main(String[] args) {
        Vector<Integer> list=new Vector<>();
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

    }
}
