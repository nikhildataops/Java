import java.util.Scanner;

public class Arrays {
    static void main(String[] args) {

//        int[] num=new int[5];
//        num[0]=95;
//        num[3]=90;
//        num[1]=956;
//        num[2]=9;
//        num[4]=905;
        int[] num={2,34,5,53,23};
//        int index=2;

//        System.out.println(num[0]);
//        System.out.println(num[1]);
//        System.out.println(num[index]);
//        System.out.println(num[3]);
//        System.out.println(num[4]);
//        Array Traversal
        int index=0;
        while(index<num.length){
            System.out.println(num[index]);
            index++;
        }


        String[] strArr={"Nikhil","Sankit"};
        String[] newStr=new String[3];
        newStr[0]="hello";
        newStr[1]="world";
        System.out.println(newStr[1]);
        System.out.println(newStr[0]);
        System.out.println(strArr[0]);



    }
}
