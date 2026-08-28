import java.util.Scanner;

public class ArraysUtility {
    public static int[] inputArray(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the numbers of the array");
        int i=0;
        while(i<size){
            System.out.println("Enter the elements number "+(i+1)+" :");
            arr[i]= input.nextInt();
            i++;
        }
        return arr;

    }
}
