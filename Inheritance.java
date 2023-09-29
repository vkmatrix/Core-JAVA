class Vehicle
{
    int modelno;
    String brand;
    Vehicle(int m,String b)
    {
        modelno=m;
        brand=b;
    }
    public void display()
    {
        System.out.println(modelno+brand);
    }
}
class Car extends Vehicle
{
    int numWheels;
     Car(int modelno,String brand,int w)
     {
        super(modelno,brand);  // super constructor call uses the super class 
        numWheels=w;
     }
     public void display2()
     {
        System.out.println(modelno+" "+brand+" "+numWheels);
     }


}

public class Inheritance {
    public static void main(String[] args)
    {
        Car c1=new Car(6969,"tesla",4);
        c1.display2();
    }
    
}
