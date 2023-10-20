public class TryCatch {
    public static void main(String[] ar)
    {
        try{
            double result=10/0;
            System.out.println(result);

        }
        catch(Exception e)
        {
            System.out.println("***** BELOW EXCEPTION OCCURED *********");
            System.out.println(e);
        }
    }
    
}
