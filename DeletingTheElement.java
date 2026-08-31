import java.util.Scanner;
 class DeletingTheElement {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=ArraysUtility.inputArray();
        System.out.println("Enter the deleting number:");
        int num=input.nextInt();
        int[] newArr=deleteNumber(arr,num);
        System.out.println("Here is your new array:");
        ArraysUtility.displayArray(newArr);
    }
    public static int[] deleteNumber(int[] arr,int num){
        int occ=NumberOfOccurances.occurencesOfElement(arr,num);
        if(occ==0){
            return arr;
        }
        int newSize= arr.length-occ;
        int[] newArr=new int[newSize];
        int i=0,j=0;
        while (i< arr.length){
            if(arr[i] !=num){
                newArr[j]=arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
