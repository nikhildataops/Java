import java.util.Scanner;

public class Reverse {
    static void main() {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= input.nextInt();
        int rev=reverse(num);
        System.out.println(rev);
    }
    public static int reverse(int num){
        int rev=0;
        int i=1;
        while(i<=num){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        return rev;

    }
}
