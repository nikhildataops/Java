import java.util.Scanner;

public class SwapTwoNumbers {
    static void main(String[] args) {
//        int a=5;
//        int b=15;
//        int c=a;
//        a=b;
//        b=c;
//        System.out.println("value of a after swapping is : "+a);
//        System.out.println("value of b  after swapping is : "+b);

        Scanner input= new Scanner(System.in);
        System.out.print("enter the first number:");
        int firstNumber= input.nextInt();
        System.out.print("enter the second number:");
        int secondNumber= input.nextInt();
        int thirdNumber=firstNumber;
        firstNumber=secondNumber;
        secondNumber=thirdNumber;
        System.out.println("first number after swapping "+firstNumber);
        System.out.println("second number after swapping "+secondNumber);


    }
}
