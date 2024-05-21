import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the temperature in Fahrenheit : ");
        float fah = input.nextFloat();
        float cel = (fah-32) * 5/9;
        System.out.println(cel);
    }
}
