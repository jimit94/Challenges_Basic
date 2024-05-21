import java.util.Scanner;

public class Perimeter {
    // calculate the perimeter of a rectangle.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size in cm of side 1:");
        int A = input.nextInt();
        System.out.print("Please enter the size in cm of side 2:");
        int B = input.nextInt();
        System.out.print("Please enter the size in cm of side 3:");
        int C = input.nextInt();
        System.out.print("Please enter the size in cm of side 4:");
        int D = input.nextInt();
        int perimeter = A+B+C+D;
        System.out.println("Perimeter of the rectangle for the given sides is "+perimeter);
    }
}
