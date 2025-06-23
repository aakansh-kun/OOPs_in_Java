import java.util.Scanner;

public class UpperCase {
    public static String convertToUpperCase(String text) {
        StringBuffer stringBuffer = new StringBuffer(text);
        for (int i = 0; i < stringBuffer.length(); i++) {
            char ch = stringBuffer.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                stringBuffer.setCharAt(i, (char) (ch - 32));
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        
        String upperCaseText = convertToUpperCase(text);
        System.out.println("Text in uppercase: " + upperCaseText);
    }
}
