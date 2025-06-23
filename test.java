class Parent {
   public void pk(){
      System.out.println("hello papa ji");

   }
   public Parent(){
     System.out.println("Daddy is king");
 }
   public Parent(int a){
     
     System.out.println("Daddy is king no. " +a);
 }

   public Parent(int a , int b){
     
     System.out.println("Daddy is king no. " +b);
 }


}
	
class Child extends Parent {
   
   public Child(int a, int b){
     super(b);
     System.out.println("Beta chota don no. " + a);
 }
public void pk(){
      System.out.println("hello");
  }



}

public class test{
	public static void main(String[] args){
		Child C1= new Child(1, 2);
                Parent P1 = new Parent();
                C1.pk();
                P1.pk();
        }
}



  
  