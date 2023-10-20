import java.io.FileInputStream;
import java.util.*;
public class Exceptions {
    public static void main(String[] arg)
    {
       
            System.out.println("example of CHECKED EXCEPTION");
            FileInputStream f1=new FileInputStream("/desktop/leo.jpg");
            System.out.println("example of UNCHECKED EXCEPTION");
            int v=10;
            System.out.println(v/0);
        

    }
    
}
