import java.util.Scanner;

public class Area {
    // calculate area of a triangle
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter breadth of the triangle : ");
        float breadth = input.nextFloat();
        System.out.print("Please enter height of the triangle : ");
        float height = input.nextFloat();
        double area = 0.5 * breadth * height;
        System.out.println("Area of triangle is : " + area);
    }
}
