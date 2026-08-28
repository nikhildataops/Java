import java.util.Scanner;

public class Average {
    static void main(String[] args) {
        int[] arr=ArraysUtility.inputArray();
        float sum=average(arr);
        System.out.println("Sum of the array:"+sum);
        float average=sum/ arr.length;
        System.out.println("Average of the arrays:"+average);
    }
    public static float average(int[] arr){
        float sum=0;
        int i=0;
        while(i<arr.length){
            sum=sum+arr[i];
            i++;
        }
        return sum;
    }

}
