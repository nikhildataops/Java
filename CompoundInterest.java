import java.util.Scanner;



public class CompoundInterest {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the principal amount:");
        int P= input.nextInt();
        System.out.print("enter the rate of the amount:");
        float R= input.nextFloat();
        System.out.print("enter the number of years:");
        int T= input.nextInt();
        double compoundInterest=P*Math.pow((1 + R / 100), T);
        System.out.println(compoundInterest);

    }
}
