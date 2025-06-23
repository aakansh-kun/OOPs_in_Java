// Base class
class Base {  
    int x;

    // Print Method
    public void printMe() {
        System.out.println("I'm a constructor");
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Getter for x
    public int getX() {
        return x;
    }
}

// Derived class (Corrected Class Name)
class Derived extends Base {  
    int y;

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }

    // Getter for y
    public int getY() {
        return y;
    }
}

// Main Class
public class Inheritance {
    public static void main(String[] args) {
        Base obj = new Base(); // Object of Base
        obj.setX(4);
        System.out.println("Value of x: " + obj.getX());

        // Demonstrating inheritance
        Derived obj2 = new Derived();  // Object of Derived class
        obj2.setX(10);
        obj2.setY(20);
        System.out.println("Value of x in Derived: " + obj2.getX());
        System.out.println("Value of y in Derived: " + obj2.getY());
    }
}
