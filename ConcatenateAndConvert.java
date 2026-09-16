import java.util.Scanner;

public class ConcatenateAndConvert {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the firstname");
        String fName= input.next();
        System.out.println("Enter the surname");
        String lName= input.next();
        String fullName=fName.concat(" ").concat(lName);
        System.out.println(fullName.toUpperCase());
        int r=10;
        double area=Math.PI*r*r;
        System.out.println(area);

    }

}
