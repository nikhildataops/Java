import java.util.Scanner;

public class Palindrome {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        int rev = palindrome(num);
        if (num==rev) {
            System.out.println("Palindrome number " + rev);
        }
        else{
            System.out.println("Not a Palindrome Number");

            }


    }

    public static int palindrome(int num) {
        int rev = 0;
        int i = 1;
        while (i <= num) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }
}
