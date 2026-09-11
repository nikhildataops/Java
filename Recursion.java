import java.util.Scanner;

public class Recursion {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= input.nextInt();
        long fact=factorial(num);
        System.out.println("factorial of "+fact);
    }
    public static long factorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        return num * factorial(num-1);
        }
    }
