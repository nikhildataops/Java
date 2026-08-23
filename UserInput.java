import java.util.Scanner;

public class UserInput {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your name:");
        String name= sc.nextLine();
        System.out.println("welcome" + " "+name);
        System.out.print("enter your age:");
        int age=sc.nextInt();
        System.out.println("i am"+" "+age+" "+"years old");

    }
}
