import java.util.Scanner;

public class ArraySearching {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean isFound=isFound(arr,num);

        if(isFound){
            System.out.println("Number was found in the array");
        } else{
            System.out.println("number was not found in the array");
        }
    }
        public static boolean isFound(int[] arr,int num) {
            int i=0;
            while(i< arr.length) {
                if (num == arr[i]) {
                    return true;
                }
                i++;
            }
            return false;
        }
    }
