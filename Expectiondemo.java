import java.util.*;

public class  Expectiondemo {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter index: ");
            int index = sc.nextInt();

            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt();

            System.out.println("Array value: " + arr[index]);

            int result = arr[index] / divisor;
            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }

        finally {
            System.out.println("Finally block is executed.");
        }
    }
}
