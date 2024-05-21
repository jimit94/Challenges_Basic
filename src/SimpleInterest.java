import java.util.Scanner;

public class SimpleInterest {
    // calculate simple interest
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the principle amount : ");
        float principle = input.nextFloat();
        System.out.print("Please enter the rate of interest per annum in percentage : ");
        float rate = input.nextFloat();
        System.out.print("Please enter the number of years  : ");
        float time = input.nextFloat();
        double SI = (principle*rate*time)/100;

        System.out.println("Payable simple interest is rupees : " + SI);
    }
}
