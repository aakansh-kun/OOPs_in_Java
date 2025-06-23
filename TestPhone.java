// Multiple inheritance.
interface Camera{
   void takeSnap();
   void recordVedio();
}

interface Wifi{
   String [] getNetworks();
   void connectToNetwork(String network);
}


class MyCellPhone{
   void callNumber(int phNumber){
      System.out.println("Calling "+ phNumber);
   }
   void pickCall(){
      System.out.println("Connecting...");
   }
   void takeSnap(){
      System.out.println("Taking Snap");
   }
}

class MySmartPhone extends MyCellPhone implements Camera , Wifi{
   public void takeSnap(){
      System.out.println("Taking Snap");
   }
   public void recordVedio(){
      System.out.println("Recording...");
   }
   public String [] getNetworks(){
      System.out.println("Getting Available Networks");
      String[] NetworkList= {"Harry", "Prashanth", "Anjali5g"};
      return NetworkList;
   }
   public void connectToNetwork(String network){
      System.out.println("Connecting to Network: " +network);
   }
}

public class TestPhone{
   public static void main(String[] args){
      MySmartPhone P1 = new MySmartPhone();
      String[] ar= P1.getNetworks();
      for(String item:ar){
         System.out.println(item);
      }
   }
}