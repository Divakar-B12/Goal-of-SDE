import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number%2==0){
            System.out.println("Given number is Even number ");
        }else{
            System.out.println("Given number is Odd number ");
        }
    }
}
