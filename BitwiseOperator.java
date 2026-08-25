import java.util.Scanner;

public class BitwiseOperator {
    static void main() {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int num1= input.nextInt();
        System.out.println("Enter the second number:");
        int num2= input.nextInt();
        int and=num1&num2;
        System.out.println("And bitwise operator:"+and);
        int or=num1|num2;
        System.out.println("OR bitwise operator:"+or);
        int xor=num1^num2;
        System.out.println("XOR bitwise opeartor:"+xor);
        int not=~num1;
        System.out.println("NOT bitwise opeartor:"+not);
        int leftShift=num1<<num2;
        System.out.println("Left Shift operator:"+leftShift);
        int rightShift=num1>>num2;
        System.out.println("right shift bitwise operator:"+rightShift);
    }
}
