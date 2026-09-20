import java.util.HashSet;

public class HashSetBasics {
    static void main(String[] args) {
        HashSet<Student> set=new HashSet<>();

        Student s1= new Student(1,"Nikhil");
        Student s2= new Student(1,"Nikhil");
        Student s3= new Student(1,"Nikhil");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);

//        Set<Integer> set1=new java.util.HashSet<>();
//        Set<Integer> set2=new LinkedHashSet<>();
//          Set<Integer> set2=new TreeSet<>();


//        set1.add(12);
//        set1.add(76);
//        set1.add(22);
//        set1.add(56);
//
//
//        set2.add(12);
//        set2.add(76);
//        set2.add(26);
//        set2.add(50);
//
//        System.out.println(set1.containsAll(set2));
//        set1.retainAll(set2);
//
//
//        System.out.println(set1);
//        System.out.println(set2);
//        System.out.println(set2.containsAll(set1));



//        set2.add(12);
//        set2.add(76);
//        set2.add(26);
//        set2.add(50);
//        System.out.println(set2);

    }
}
