import java.util.Scanner;

public class FahrenheitToCelcius {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the temperature in fahrenheit:");
        float fahrenheit= input.nextInt();
        float celcius=(fahrenheit-32)*5.0f/9.0f;
        System.out.println("temperature in celcius:"+celcius);
    }
}
