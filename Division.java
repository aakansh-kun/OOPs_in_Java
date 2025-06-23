import java.util.Scanner;

class Division {
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter Numerator: ");
            double a = s.nextDouble();
            System.out.print("Enter Denominator: ");
            double b = s.nextDouble();

            double div = (double) a / b;
            System.out.println("Result: " + div);	    
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Denominator cannot be 0");
        } 
        finally {
            System.out.println("Operation Completed");
            s.close();
        } 
    }
}
