class Cylinder{
  private int radius;
  private int height;
  
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
  
  public double surfaceArea(){
  return 2*3.14*radius*(height + radius);
  }

  public double Volume(){
  return Math.PI*radius*radius*height;
  }

  public static void main(String[] args){
  Cylinder C1= new Cylinder();
  C1.setRadius(10);
  C1.setHeight(20);
  System.out.println("Surface Area is : " +C1.surfaceArea());
  System.out.println("Surface Area is : " +C1.Volume());
  }

}