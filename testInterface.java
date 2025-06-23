interface Bicycle{
   void applyBreak(int decrement);
   void speedUp(int increment);
}

interface Bike{
   void ride(); // Example of Multiple inheritance.
}

class AvonCycle implements Bicycle , Bike{
   void blowhorn(){
      System.out.println("pee pee poo poo");
   }
   public void applyBreak(int decrement){
      System.out.println("Applying breaks by decrement of " + decrement);
   }
   public void speedUp(int increment){
      System.out.println("Speeding uppppp");
   }
   public void ride() {
      System.out.println("I'm a rider, provider"); // Implementing Bike interface method
   }
}

public class testInterface{
   public static void main(String[] args){
      AvonCycle C1 = new AvonCycle();
      C1.applyBreak(5);
      C1.ride();
      // You can create properties in Interface.
      // You can't modify properties in Interface as they are final.
   }
}
