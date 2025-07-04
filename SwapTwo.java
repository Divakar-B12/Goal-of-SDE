public class SwapTwo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swap of two numbers ");
        System.out.println("First number " +a);
        System.out.println("Second number " +b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap of two numbers ");
        System.out.println("First number " +a);
        System.out.println("Second number " +b);
    }
}
