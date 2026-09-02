import java.util.Scanner;

public class SearchingTwoDimensional {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] numArr=ArraysUtility.input2DArray();

        System.out.println("Enter the searching number in the array");
        int num= input.nextInt();
        boolean isFound=searching2DArray(numArr,num);
        if(isFound){
            System.out.println("Number present in the array");

        }else {
            System.out.println("Number not present in the array");
        }
    }
    public static boolean searching2DArray(int[][] numArr ,int num){
        int i=0;
        while(i<numArr.length){
            int j=0;
            while(j<numArr.length){
                if(num == numArr[i][j]){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;

    }
}
