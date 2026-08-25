import java.util.Scanner;

public class OddNum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        int sum=OddNumberSum(num);
        System.out.println(sum);

    }
    public static int OddNumberSum(int num){
        int i=0;
        int sum=0;
        while(i<=num){

            if(i%2!=0){
                sum=sum+i;
            }
            i++;
        }
        return sum;
        }


}

