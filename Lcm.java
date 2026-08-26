import java.util.Scanner;

public class Lcm {
    static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1= input.nextInt();
        System.out.println("Enter the second number:");
        int num2= input.nextInt();
        int factor= lcmOfNumber(num1,num2);
        System.out.println(factor);

    }
    public static int lcmOfNumber(int num1,int num2){
        int i=1;
        while (true){
            int factor=num1*i;
            if(factor%num2==0){
                return factor;


            }
        i++;
        }
    }
}
