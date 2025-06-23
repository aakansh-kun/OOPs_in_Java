import java.util.Scanner;

public class ArrayExcept {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter an index (0-4): ");
            int index = s.nextInt();

            System.out.println("Element at index " + index + ": " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Please enter a value between 0 and 4.");
        } finally {
            System.out.println("Array access attempted.");
            s.close();
        }
    }
}
