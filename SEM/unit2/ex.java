package unit2;

abstract class f1
{
    abstract void say();
}
class f2 extends f1
{
    @Override
    public void say()
    {
        System.out.println("hii!!");
    }
}

public class ex{
    public static void main(String[] ar) 
    {
        f2 o1=new f2();
        o1.say();
    }
}