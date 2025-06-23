class SuperClass {
    private int privar = 10;
}

class SubClass extends SuperClass {
    public void display() {
        System.out.println("private variable: " + privar); // ERROR: Cannot access privar directly
    }
}

public class PrivateMemberTest {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
    }
}