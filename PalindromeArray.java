public class PalindromeArray {
    static void main(String[] args) {
        int[] numArray=ArraysUtility.inputArray();
        boolean isPalin=reverseArray(numArray);
        if(isPalin){
            System.out.println("Palindrome");

        }else {
            System.out.println("Not Palindrome:");
        }

    }
    public static boolean reverseArray(int[] numArray){
        int i=0;
        while (i< numArray.length/2){
            if(numArray[i]!=numArray[numArray.length-1-i]){
                return false;
            }
            i++;

        }
     return true;
    }
}
