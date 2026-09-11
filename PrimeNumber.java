import java.util.Scanner;

public class PrimeNumber {
    static void main() {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= input.nextInt();
        boolean prime=primeNumber(num);
        if(prime==true){
            System.out.println("Prime Number");

        } else{
            System.out.println("Not a Prime number");
        }
    }
    public static boolean primeNumber(int number){
        int i=2;
        while(i<number){
            if(number%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
