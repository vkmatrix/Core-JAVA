package unit2;

interface int1
{
    void method1();
}
interface int2 
{
    void method2();
}

class eg implements int1,int2
{
    @Override
    public void method1()
    {
        System.out.println("first interface method");
    }
    @Override
    public void method2()
    {
        System.out.println("second interface method");
    }
}

public class MULTIPLEINTERFACE
{
    public static void main(String[] ar) 
    {
        eg o1=new eg();
        o1.method1();
        o1.method2();
    }
}