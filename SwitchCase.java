import java.util.Scanner;

public class SwitchCase {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Simple Week days calculator:");
        System.out.println("Enter the days number(1-7):");
        int day = input.nextInt();
        oldSwitch(day);
        newSwitch(day);

    }

    public static void oldSwitch(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid day!");
        }

    }
    public static void newSwitch(int day){
        String output= switch (day){
            case 1->"monday";
            case 2->"tuesday";
            case 3->"wednesday";
            case 4->"thursday";
            case 5->"friday";
            case 6->"saturday";
            case 7,8->"sunday";
            default -> "invalid";
        };
        System.out.println(output);
    }
}
