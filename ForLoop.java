import java.util.Scanner;

public class ForLoop {
    static void main() {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= input.nextInt();
        System.out.println("Table of "+n);
        for (int i=1;i<=10;i++){
            System.out.println( i*n);
        }
    }
}
