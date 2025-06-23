import java.util.Scanner;

public class StringSearch {
    public static int findFirstOccurrence(String text, String searchStr) {
        return text.indexOf(searchStr);
    }

    public static int findLastOccurrence(String text, String searchStr) {
        return text.lastIndexOf(searchStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        
        System.out.print("Enter the character or substring to search for: ");
        String searchStr = scanner.nextLine();
        
        int firstIndex = findFirstOccurrence(text, searchStr);
        int lastIndex = findLastOccurrence(text, searchStr);
        
        System.out.println("First occurrence of '" + searchStr + "': " + (firstIndex != -1 ? firstIndex : "Not found"));
        System.out.println("Last occurrence of '" + searchStr + "': " + (lastIndex != -1 ? lastIndex : "Not found"));
        
        scanner.close();
    }
}
