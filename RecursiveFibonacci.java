import java.util.Scanner;

public class RecursiveFibonacci {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=input.nextInt();
        long first=0;
        long second=1;
        long third=0;
        if(num==0){
            System.out.println(first);
        } else if (num==1) {
            System.out.println(second);
        } else {
            for (int i=2;i<=num;i++){
                third=first+second;
                first=second;
                second=third;
            }
            System.out.println(third);
        }
    }
}
