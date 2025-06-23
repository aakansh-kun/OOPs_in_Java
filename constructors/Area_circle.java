class Area_circle{
  private float radius;
  
  public void setRadius(float r){
  radius= r;
  }
  public float getRadius(){
  return radius;
  }
  public static void main(String[] args){
  Area_circle circle= new Area_circle();
  circle.setRadius(10.0f);
  System.out.println("Area of circle is :" + 3.14 * circle.getRadius() * circle.getRadius());
  }
}