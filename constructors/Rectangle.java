class Rectangle{
  private int length;
  private int breadth;
 
  public Rectangle(){
  this.length = 4;
  this.breadth = 5;
  }

  public Rectangle(int length , int breadth){
  this.length = length;
  this.breadth = breadth;
  }

  public static void main(String[] args){
  Rectangle r= new Rectangle(10 , 20);
  }
}