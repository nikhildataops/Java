import java.util.Scanner;

public class GreatestNumber {
    static void main() {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber= input.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber=input.nextInt();
        System.out.println("Enter the third number:");
        int thirdNumber= input.nextInt();
        if(firstNumber>secondNumber && firstNumber>thirdNumber){
            System.out.println("First Number is the Greatest Number:"+firstNumber);
        } else if (secondNumber>firstNumber && secondNumber>thirdNumber){
            System.out.println("Second Number is the Greatest Number:"+secondNumber);

        } else if (thirdNumber>firstNumber && thirdNumber>secondNumber) {
            System.out.println("Third Number is the Greatest Number:"+thirdNumber);

        } else {
            System.out.println("All numbers are equal");
        }


    }

}
