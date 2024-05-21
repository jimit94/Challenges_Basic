import java.util.Scanner;

public class Product {
    // calculate product of two floating point numbers.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first floating point number : ");
        float a = input.nextFloat();
        System.out.print("Please enter second floating point number :");
        float b = input.nextFloat();
        float c = a*b;
        System.out.println("Product of the two numbers is : " + c);
    }
}