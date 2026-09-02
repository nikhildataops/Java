public class DiagonalSum2D {
    static void main(String[] args) {
        int[][] numArr=ArraysUtility.input2DArray();
        long sum=diagonalSum(numArr);
        System.out.println("Sum of diagonal elements:"+sum);
    }
    public static long diagonalSum(int[][] numArr){
        long leftSum=leftDiagonalSum(numArr);
        long rightSum=leftDiagonalSum(numArr);
        long sum=leftSum+rightSum;
        if(numArr.length%2!=0){
            int ind = numArr.length / 2;
            sum -= numArr[ind][ind];
        }
    return sum;
    }

public static long leftDiagonalSum(int[][] numArr) {
        long sum=0;
        int i =0;
        while (i< numArr.length){
            sum+=numArr[i][i];
            i++;
        }
        return sum;
 }
public static long rightDiagonalSum(int[][] numArr){
        long sum=0;
        int i=0;
        while (i< numArr.length){
            int col= numArr.length-1-i;
            sum+=numArr[i][col];
            i++;
        }
        return sum;


       }
 }
