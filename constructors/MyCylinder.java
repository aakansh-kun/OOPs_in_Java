class MyCylinder{
  private int radius;
  private int height;
 
  public MyCylinder(int radius, int height){
  this.radius = radius;
  this.height = height;
  }
  
/*
  public void setRadius(int r){
  radius = r;
  }
  
  public int getRadius(){
  return radius;
  }
  public void setHeight(int h){
  height = h;
  }
  
  public int getHeight(){
  return height;
  }
  
*/

  public double surfaceArea(){
  return 2*3.14*radius*(height + radius);
  }

  public double Volume(){
  return Math.PI*radius*radius*height;
  }

  public static void main(String[] args){
  MyCylinder C1= new MyCylinder(10 , 20);
  System.out.println("Surface Area is : " +C1.surfaceArea());
  System.out.println("Surface Area is : " +C1.Volume());
  }

}