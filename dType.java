public class dType {
    static void main() {
        //boolean
        /*boolean found=true;
        boolean isAvailable= false;
        System.out.println(found);
        System.out.println(isAvailable);*/

        //character
        char ch='N';
        System.out.println("My name is :" + ch);
        System.out.println("My name is :" + (char)(ch+2));
        //integers
        //byte,short,int,long
        byte marks=127;
        System.out.println("my marks:"+ marks );

        short weight=5000;
        System.out.println("my weight is:"+weight);

        int height=1000000000;
        System.out.println("my height is:"+height);

        long levelUp=9999L;
        System.out.println("My level:"+levelUp+"+");
        // decimal points
        float percent=84.2f;
        System.out.println("my percentage:"+percent);

        double avg=84.222222222222255223;
        System.out.println("average out of 100:"+avg);
        // implicitly conversion
        byte num1=12;
        short num2=num1;
        System.out.println(num2);

        int num3=num2;
        System.out.println(num3);

        float num4=num3;
        System.out.println(num4);

        int num5=ch;
        System.out.println(num5);
        // Explicitly
        int num=101;
        char myCh= (char)num;
        System.out.println(myCh);

        int myNum=15;
        byte myNum2=(byte)myNum;
        System.out.println(myNum2);










    }
}
