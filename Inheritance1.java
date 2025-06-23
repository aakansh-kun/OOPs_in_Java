class Base1 { 
    Base1() {
        System.out.println("Mai ek comstructor hu");
    }
    Base1(int x) {
        System.out.println("Mai ek overloaded comstructor hu:  " + x);
    } 
}
class Derived1 extends Base1 { 
    Derived1() {
        //super(0);// run constructor with argument.
        System.out.println("Mai ek derived class ka comstructor hu");

    } 
    Derived1(int x , int y) {
        super(x);// run constructor with argument.
        System.out.println("Mai ek overloaded derived class ka comstructor hu:  " +y);

    }
}

class childOfDerived extends Derived1 { 
    childOfDerived() {
        System.out.println("Mai ek child of derived class ka comstructor hu");

    }
    childOfDerived(int x , int y, int z) {
        super(x , y);
        System.out.println("Mai ek child of derived class ka comstructor hu:  " +z);

    }
} 


public class Inheritance1 {
    public static void main(String[] args) {
        //Base1 obj = new Base1(); // Object of Base
        
        Derived1 obj2 = new Derived1();  // Object of Derived class
// phle base class ka constructor run hoga fir derived class ka
       Derived1 obj3 = new Derived1(4 , 9);
       childOfDerived obj4 = new childOfDerived(1, 2, 3);
    }
}
