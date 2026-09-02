public class ReverseArray {
    static void main(String[] args) {
        int[] numArr=ArraysUtility.inputArray();
        reverseArray(numArr);
        System.out.println("Reverse Array:");
        ArraysUtility.displayArray(numArr);


    }
    public static void reverseArray(int[] reverseArr){
        int i=0;
        while(i<reverseArr.length/2){
            int swap=reverseArr[i];
            reverseArr[i]= reverseArr[reverseArr.length-i-1];
            reverseArr[reverseArr.length-i-1]=swap;
            i++;
        }

    }
}
