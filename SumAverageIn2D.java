public class SumAverageIn2D {
    static void main(String[] args) {
        int[][] num=ArraysUtility.input2DArray();
        int sum=sumOf2DArray(num);
        System.out.println("Sum of the arrays:"+sum);
        double average=average2D(num);
        System.out.println("Average of the array:"+average);
    }
    public static int sumOf2DArray(int[][] num){
        int sum=0;
        int i=0;
        while (i< num.length){
            int j=0;
            while(j< num.length){
                sum+=num[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double average2D(int[][] num ) {
        if (num.length == 0) {
            return 0;
        }
            int rows = num.length;
            int cols = num[0].length;
            double size = rows * cols;
            return sumOf2DArray(num) / size;

        }

    }
