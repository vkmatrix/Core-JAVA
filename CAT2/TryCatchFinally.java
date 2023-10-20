import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchFinally {
    public static void main(String[] ar)
    {
        try{
            double var=10/0;
            FileInputStream fis=new FileInputStream("/desktop/leo.jpg");
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae.getMessage());
        }
        finally
        {
            System.out.println("finally block is executed");
        }
    }

    
}
