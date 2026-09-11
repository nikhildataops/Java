import java.util.Scanner;

public class PasswordChecker {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to set your password:");
        String password;
        boolean isValid;
        do{
            System.out.println("Enter your password:");
            password= input.nextLine();
    }while (!isValidPassword(password));
        System.out.println("thanks for entering the password");
    }
    public static boolean isValidPassword(String password){
        return password.length()>6;
    }
}
