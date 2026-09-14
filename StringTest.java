public class StringTest {
    static void main() {
        StringBuilder sb= new StringBuilder("First");
        sb.append(45);
        sb.append(", now this is the");
        sb.append(76.45);
        sb.toString();
        System.out.println(sb);
    }
}
