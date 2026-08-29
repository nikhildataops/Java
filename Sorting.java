public class Sorting {
    static void main(String[] args) {
        int[] num=ArraysUtility.inputArray();
        boolean increase=increasing(num);
        boolean decrease=decreasing(num);
        if(increase||decrease){
            System.out.println("Sorted");
        } else{
            System.out.println("not sorted");
        }


    }
    public static boolean increasing(int[] num){
        int i=1;
        while (i<num.length){
            if(num[i]<num[i-1]){
                return false;
            }
            i++;
        }

        return true;
    }
    public static boolean decreasing(int[] num){
        int i=1;

        while (i<num.length){
            if(num[i]>num[i-1]){
                return false;
            }
           i++;
        }
        return true;
    }
}
