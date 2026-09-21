import java.util.Comparator;

public class ReverseComparator implements Comparator<Integer> {
    static void main(String[] args ) {


    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return - Integer.compare(o1,o2);
    }
}
