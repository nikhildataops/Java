public class TwoDimensionalArrays {
    static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr[0].length);
        int[][] num=new int[2][3];
        num[0][0]=1;
        num[0][1]=4;
        num[0][2]=6;
        num[1][0]=7;
        num[1][1]=9;
        num[1][2]=8;
        System.out.println(num[1][1]);
        //2D Arrays Traversal
        int i=0;
        while(i< arr.length){
            int j=0;
            while(j<arr[i].length){
                System.out.print(arr[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;


        }



    }
}
