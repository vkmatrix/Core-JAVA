import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Throw {
    public static void main(String[] ar)
    {
        int n1,n2;
        double val;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number1: ");
        n1=s.nextInt();
        System.out.println("enter number2: ");
        n2=s.nextInt();
        try
        {
            if(n2==0)
            {
                throw new ArithmeticException("division by zero da junni");
            }
            val=n1/n2;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("finally block is executed");
            if(n2!=0)
            {
                val=n1/n2;
                System.out.println("value = "+val);
            }
            
        }
    }
    
}
