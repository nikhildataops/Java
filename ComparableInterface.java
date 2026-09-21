import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableInterface {
    static void main(String[] args) {
        List<StudentComparable> students=new ArrayList<>();
        students.add(new StudentComparable(18,"Nikhil",59));
        students.add(new StudentComparable(20,"Nitin",63));
        students.add(new StudentComparable(20,"Sankit",54));
        students.add(new StudentComparable(15,"Harshit",45));

        System.out.println(students);
//        Collections.sort(students,new WeightComparator());


//        Collections.sort(students, new Comparator<StudentComparable>() {
//            @Override
//            public int compare(StudentComparable o1, StudentComparable o2) {
//                return o1.weight- o2.weight;
//
//            }

//        });

        Collections.sort(students,((o1, o2) ->  o1.weight - o2.weight ));
        System.out.println(students);

        //comparing
        //thencomparing



//        List<Integer> list=new ArrayList<>();
//        list.add(10);
//        list.add(15);
//        list.add(8);
//        list.add(20);
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list );

    }
}
