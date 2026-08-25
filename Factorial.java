import java.util.Scanner;

public class Factorial {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num= input.nextInt();
            long factorial=factorialNumber(num);
            System.out.println("factorial of a number: "+factorial);


    }
    public static long factorialNumber(int num){

        if (num==0 || num==1) {
            return 1;
        }
        int i=2;
        long factorial=1;
        while(i<=num){
            factorial*=i;
            i++;
        }
        return factorial;


    }
}

