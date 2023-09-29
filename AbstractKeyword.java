abstract class shape         // abstract class
{
    abstract double findArea();  // abstract method
    protected void display()   // non abstract method
    {
        System.out.println("this is a shape");
    }

}
class triangle extends shape
{
    double base,height;
    triangle(double b,double h)
    {
        this.base=b;
        this.height=h;
    }
    @Override
    double findArea()   
    {
        return 0.5*base*height;
    }
}
class circle extends shape
{
    double radius;
    circle(double r)
    {
        this.radius=r;
    }
    @Override
    double findArea()
    {
        return 3.14*radius*radius;
    }
}

public class AbstractKeyword {
    public static void main(String[] args)
    {
        circle c1=new circle(0.00);
        System.out.println(c1.findArea());
    }
}
