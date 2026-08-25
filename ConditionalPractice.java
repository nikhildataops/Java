import java.util.Scanner;

public class ConditionalPractice {
    static void main() {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num= input.nextInt();
//        Even Numbers
        if(num%2==0){
            System.out.println("even number:");
        } else {
            System.out.println("odd number");
        }
        //Number is positive,Negative or Zero
//        if (num>0){
//            System.out.println("positive number");
//        } else if (num<0 ){
//            System.out.println("negative number");
//        }
//        else {
//            System.out.println("zero");
//        }
    }
}
