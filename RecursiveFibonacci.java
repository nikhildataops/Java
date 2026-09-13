import java.util.Scanner;

public class RecursiveFibonacci {
    static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter the number");
//        int num=input.nextInt();
//        long first=0;
//        long second=1;
//        long third=0;
//        if(num==0){
//            System.out.println(first);
//        } else if (num==1) {
//            System.out.println(second);
//        } else {
//            for (int i=2;i<=num;i++){
//                third=first+second;
//                first=second;
//                second=third;
//            }
//            System.out.println(third);
//        }
    Scanner input=new Scanner(System.in);
        System.out.print("Enter the number");
        int count= input.nextInt();
        for(int i=1;i<=count;i++){
            System.out.print(fibonacci(i)+ " ");
        }

    }
    public static int fibonacci(int position){

        if(position==1){
            return 0;
        }
        if (position==2){
            return 1;
        }
        return fibonacci(position-1)
                + fibonacci(position-2);


    }
}
