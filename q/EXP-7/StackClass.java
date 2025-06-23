import java.util.Scanner;

interface StackInterface 
{
    void push(int value);
    int pop();
    void display();
}

class StackClass implements StackInterface 
{
    private int maxSize;
    private int[] stackArray;
    private int top;
    public StackClass(int size) 
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    @Override
    public void push(int value) 
    {
        if (top < maxSize - 1) 
        {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        } 
        else 
        {
            System.out.println("Stack Overflow! Cannot push " + value);
        }
    }
    @Override
    public int pop() 
    {
        if (top >= 0) 
        {
            int poppedValue = stackArray[top--];
            System.out.println("Popped: " + poppedValue);
            return poppedValue;
        } 
        else 
        {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1; 
        }
    }
    @Override
    public void display() 
    {
        if (top >= 0) 
        {
            System.out.print("Stack Elements: ");
            for (int i = 0; i <= top; i++) 
            {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        } 
        else 
        {
            System.out.println("Stack is empty.");
        }
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = scanner.nextInt();
        StackClass stack = new StackClass(size);
        while (true) 
        {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int X = scanner.nextInt();
            switch (X) 
            {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please select again.");
            }
        }
    }
}
