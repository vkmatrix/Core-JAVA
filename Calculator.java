class ex
{
    public int add(int a,int b)
    {
      return a+b;  
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
    public int mul(int a,int b)
    {
        return a*b;
    }
    public float div(int a,int b)
    {
        
        return a/b;
    }
}



public class Calculator
{
    public static void main(String[] args)
    {
        ex e1 =new ex();
        System.out.println(e1.add(4,2));
        System.out.println(e1.sub(4,2));
        System.out.println(e1.mul(4,2));
        System.out.println(e1.div(4,2));
    }
}