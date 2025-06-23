import java.util.Scanner;

public class UpperCase1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a statement: ");
        String input = scanner.nextLine();

        String upperCaseStr = convertToUpperCase(input);

        System.out.println("Uppercase: " + upperCaseStr);

        scanner.close();
    }

    public static String convertToUpperCase(String str) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32)); 
            } else {
                result.append(ch); 
            }
        }

        return result.toString();
    }
}
