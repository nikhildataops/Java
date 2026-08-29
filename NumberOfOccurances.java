import java.util.Scanner;

public class NumberOfOccurances {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[] arr=ArraysUtility.inputArray();
        System.out.println("Enter the number you want:");
        int num= input.nextInt();
        int count=occurencesOfElement(arr,num);
        System.out.println("occurances of the element:"+count);

    }
    public static int occurencesOfElement(int[] arr,int num){
        int i=0;
        int count=0;
        while (i< arr.length){
            if(num==arr[i]){
                count++;
            }
            i++;
        }
        return count;
    }
}
