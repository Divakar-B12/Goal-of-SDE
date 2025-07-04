import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float radius = input.nextFloat();
        double Area = 3.1416 * (radius * radius);
        System.out.println("Area of Circle is "+Area);
    }
}
