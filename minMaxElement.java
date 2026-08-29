import java.util.Arrays;
import java.util.Scanner;

public class minMaxElement {
    static void main(String[] args) {
        int[] num=ArraysUtility.inputArray();
        int minimum=min(num);
        System.out.println("Minimum number of the array "+minimum);
        int maximum=max(num);
        System.out.println("Maximum element of the array:"+maximum);
    }

    public static int min(int[] num){
        if(num.length==0){
            return Integer.MIN_VALUE;
        }
        int i=0;
        int minimum=Integer.MAX_VALUE;
        while(i<num.length){
            if(minimum>num[i]){
                minimum=num[i];
            }
            i++;
        }
        return minimum;
    }
    public static int max(int[] num){
        if(num.length==0){
            return Integer.MAX_VALUE;

        }
        int i=1;
        int maximum=num[0];
        while(i< num.length){
            if(maximum<num[i]){
                maximum=num[i];
            }
            i++;
        }

        return maximum;
    }
}
