

import java.util.Scanner;

/**
 * this is my main method
 *
 *
 */

public class OddEvenByBitwise {
    static void main() {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number:");

        int num= input.nextInt();
        if((num&1)==0){
            System.out.println("even");

        } else{
            System.out.println("odd");
        }

    }

}
