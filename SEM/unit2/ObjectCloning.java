package unit2;

class calculator implements Cloneable
{
    private int a,b;
    calculator(int x,int y)
    {
        a=x;
        b=y;
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone(); // shallow clone
    }
    public int add()
    {
        return a+b;
    }
}

public class ObjectCloning 
{
    public static void main(String[] ar)  throws CloneNotSupportedException
    {
        calculator o1=new calculator(9, 6);
        calculator o2=(calculator) o1.clone() ;

        System.out.println(o2.add());
    }
}
