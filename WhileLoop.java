import java.util.Scanner;

public class WhileLoop {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = input.nextInt();
        int i = 1;//initialization
        while (i <= num) {//condition
            System.out.println(i);//code
            i++;//updating the condition
        }
        System.out.println("Next loop");
        int count=500;
        while(count>=0){
            System.out.println(count);
            count--;
        }

    }
}
