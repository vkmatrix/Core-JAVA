class zeroDivision
{
    int a,b;
    zeroDivision(int x,int y)
    {
        a=x;
        b=y;
    }
    void divide() throws ArithmeticException
    {
        try{
        System.out.println((double)a/b);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("finally block");
        }
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        zeroDivision o1=new zeroDivision(6, 7);
        o1.divide();
        zeroDivision o2=new zeroDivision(7, 0);
        o2.divide();
        
    }
    
}
