import java.util.Scanner;

public class Table {
    static void main() {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number");
        int num= input.nextInt();
        table(num);



    }
    public static void table(int num) {
        int i=1;
        while (i<=10){

            System.out.println(num+"X"+i+"="+num*i);
            i++;
        }




    }
}
