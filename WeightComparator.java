import java.util.Comparator;

public class WeightComparator implements Comparator<StudentComparable> {
    @Override
    public int compare(StudentComparable o1, StudentComparable o2) {
//        return o1.weight- o2.weight;
        return Integer.compare(o1.weight, o2.weight);
    }
}
