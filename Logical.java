import java.util.Scanner;

public class Logical {
    static void main() {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to ticket Discount calculator:");
        System.out.println("Enter your age:");
        int age= input.nextInt();
        System.out.println("Are you a female?(true/false)");
        boolean female=input.nextBoolean();

        if(age<=5){
            System.out.println("75% Discount");
        }
        else if(age>60 && !(female)){
            System.out.println("25% Discount");
        }
        else if(female){
            System.out.println("50% Discount");
        }


    }
}
