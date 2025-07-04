import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float principalAmount = input.nextFloat();
        float rateOfInterest = input.nextFloat();
        int time = input.nextInt();
        double si = principalAmount*rateOfInterest*time/100;
        System.out.println("The Simple Interest is "+si);
    }
}
