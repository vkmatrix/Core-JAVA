package unit2;

interface Adder
{
    void add(int x,int y);
}
class math implements Adder
{
    @Override
    public void add(int a,int b)  // always give public when you Override an abstarct method from interface
    {
        System.out.println(a+b);
    }
}

public class Interfaces {
    public static void main(String[] ar) 
    {
        math o1=new math();
        o1.add(6, 9);    
    }
    
}
