import java.util.*;
class conditions
{
    int age;
    void conditions()
    {
        if(age>=18)
        {
            System.out.println("adult");
        }
        else
        {
            System.out.println("minor");
        }
    }
}
abstract class loops
{
    loops()
    {
        System.out.println("loops perform operations repeatedly");
    }
    abstract void repeatName();
}
class forLoop extends loops
{
    String name;
    int iterations;
    @Override
    void repeatName()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter name:");
        name=s1.next();
        System.out.println("enter number of times to repeat:");
        iterations=s1.nextInt();
        for(int i=0;i<iterations;i++)
        {
            System.out.println(name);
        }
    }
}
class doWhile extends loops
{
    String name;
    int iterations;
    @Override
    void repeatName()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter name:");
        name=s1.next();
        System.out.println("enter number of times to repeat:");
        iterations=s1.nextInt();
        int i=0;
        do
        {
            System.out.println(name);
            i++;
        }
        while(i<iterations);
    }
    
}

public class ControlStatements {
    public static void main(String args[])
    {
        System.out.println("do while loop");
        doWhile d1=new doWhile();
        d1.repeatName();
    }
    
}
