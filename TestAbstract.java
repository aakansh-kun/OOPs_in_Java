// abstract class & methods

abstract class Parent2{
   public Parent2(){
      System.out.println("Mai Ek Base2 ka Constructor hu");
   }
   public void sayHello(){
      System.out.println("Hello");
   }
   abstract void greet();
   abstract void greet2();
}

class Child2 extends Parent2{
   public void greet(){
      System.out.println("Good Morning");
   }
   public void greet2(){
      System.out.println("Good Afternoon");
   }

}

abstract class Child3 extends Parent2{
   public void th(){
      System.out.println("Th");
   }

}

class Child4 extends Child3{
}

public class TestAbstract{
   public static void main(String[] args){
   Child2 C1 = new Child2();
   C1.greet2();
   Child4 C2 = new Child4();
   C2.th();
   }
}