import java.util.Scanner;

public class Return {
    static void main(String[] args) {
        int firstNumber=readNumber();
        int secondNumber=readNumber();
        int sum=firstNumber+secondNumber;
        System.out.println("sum of numbers: "+sum);

    }
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num = input.nextInt();
        return num;
    }
}
