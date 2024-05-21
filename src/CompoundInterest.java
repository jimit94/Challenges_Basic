import java.util.Scanner;

public class CompoundInterest {
    // calculate the compound interest.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the principle amount : ");
        float principle = input.nextFloat();
        System.out.print("Please enter the rate of interest per annum in percentage : ");
        float rate = input.nextFloat();
        System.out.print("Please enter the number of years  : ");
        float time = input.nextFloat();
       double R = (1 + (0.01 * rate));
        double CI = (principle * Math.pow(R,time));
        System.out.println(CI);
    }

}
