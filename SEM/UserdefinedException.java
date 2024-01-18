import java.util.*;
import java.io.Console;

class NegativeException extends Exception
{
    public NegativeException(String message)
    {
        super(message);
    }
}


public class UserdefinedException
{
    public static void main(String[] ar) throws NegativeException
    {
        try
        {
            int age;
            Console console=System.console();
            Scanner sc=new Scanner(System.in);
            age=sc.nextInt();
            if(Math.abs(age)!=age)
            {
                throw new NegativeException("poda punda");
            }
            console.writer().println("misssion passed respect!!!!!");
        }
        catch(NumberFormatException ne)
        {
            ne.printStackTrace();
        }
        catch(NegativeException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("BYE!!!!!");
        }

    }
}