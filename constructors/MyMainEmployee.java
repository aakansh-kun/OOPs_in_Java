class MyMainEmployee{
  private int id;
  private String name;
  public MyMainEmployee() {
  id= 101;
  name= "Your Name Here";
  }
  public void setName(String r){
  name = r;
  }
  public String getName(){
  return name;
  }
  public void setId(int i){
  id = i;
  }
  public int getId(){
  return id;
  }
  public static void main(String[] args){
  MyMainEmployee Harry= new MyMainEmployee();
  Harry.setName("Aakansh");
  Harry.setId(123);
  System.out.println("Details of new Employee is : " + Harry.getName() + "\n" + Harry.getId());
  }
}