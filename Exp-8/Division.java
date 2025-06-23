import java.util.Scanner;

class Division
{
    public static void main(String[] args)
    {        
	Scanner s = new Scanner(System.in);
        try
        {
            System.out.print("Enter Numerator: ");
            int a= s.nextInt();
            System.out.print("Enter Denominator: ");
            int b= s.nextInt();
            double div= (double) a/b;
            System.out.println("Result: "+div);	    
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator can not be 0");
        }
        finally
        {
            System.out.println("Operation Completed");
        } 
        s.close();
    }
}