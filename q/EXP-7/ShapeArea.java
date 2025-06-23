abstract class Shape 
{
    abstract void calculateArea();
}

class Rectangle extends Shape 
{
    private double length;
    private double width;
    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }
    @Override
    void calculateArea() 
    {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Circle extends Shape 
{
    private double radius;
    private static final double PI = 3.14;
    public Circle(double radius) 
    {
        this.radius = radius;
    }
    @Override
    void calculateArea() 
    {
        double area = PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
public class ShapeArea {
    public static void main(String[] args) 
    {
        Shape rectangle = new Rectangle(10, 5);
        Shape circle = new Circle(7);
        rectangle.calculateArea();
        circle.calculateArea();
    }
}
