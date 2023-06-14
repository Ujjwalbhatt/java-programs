class Shape
{
    public double area()
    {
        return 0.0;
    }
}
class Triangle extends Shape
{
    private double base;
    private double height;
    public Triangle(double base,double height)
    {
        this.base=base;
        this.height=height;
    }
    public double area()
    {
        return 0.5*base*height;
    }
}
class Circle extends Shape{
    private double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public double area()
    {
        return 3.14*radius*radius;
    }
}
class Rectangle extends Shape
{
    private double length;
    private double breadth;
    public Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public double area()
    {
        return length*breadth;
    }
}

class Xyz
{
    public static void main(String args[])
    {
        Triangle t1=new Triangle(2,1);
        System.out.println("Area Of Triangle of base 2 and height 1 is: "+t1.area());

        Circle c1=new Circle(5);
        System.out.println("Area Of Circle of radius 5 is: "+c1.area());

        Rectangle r1=new Rectangle(4,4);
        System.out.println("Area Of Rectangle of length 4 and base 4 is: "+r1.area());
    }
}
