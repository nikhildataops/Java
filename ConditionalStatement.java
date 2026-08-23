import java.util.Scanner;

public class ConditionalStatement {
    static void main() {
        //Relational operators
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age= input.nextInt();
        if(age>=18){
            System.out.println("You can drive");
        }
        else{
            System.out.println("You cannot drive");
        }



    }

}
