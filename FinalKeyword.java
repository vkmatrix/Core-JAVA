import java.util.Scanner;

final class electricvehicle
{
    String vname;
    int NumWheels;
    electricvehicle(final int NumWheels)
    {
        this.NumWheels=NumWheels;
    }
    final protected void getName()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the vehicle name: ");
        this.vname=sc.next();
    }
    final void say()
    {
        System.out.println("im beta");
    }
}
class fuelvehicle extends electricvehicle  // electricvehicle cannot be a superclass for fuelvehicle because its a final class
{

    void say()     // cannot be overridden from say() of superclass because its a final method
    {
        System.out.println("im alpha");
    }
}


public class FinalKeyword {
    public static void main(String[] args)
    {
        fuelvehicle scorpio=new fuelvehicle();
        scorpio.say();
    }
    
}
