package unit1;
import java.io.Console;
import java.util.*;

public class Strings 
{
    public static void main(String[] ar) 
    {
     System.out.println("welcome to string operations!!!!!");
     Console console=System.console();
     String ip=console.readLine("enter your string: ");
     console.writer().println("LENGTH: "+ip.length());  
     String ip2=console.readLine("enter string2: ");
     console.writer().println("CONCATENATED STRING: "+ ip.concat(" ").concat(ip2));
     console.writer().println("COMPARISION OF TWO STRINGS: "+ ip.compareTo(ip2));
     console.writer().println("EQUALS TO: "+ip.equals(ip2));
     System.out.println("CHARECTER AT: "+ip.charAt(0));
     System.out.println("CONTAINS: "+ip.contains(ip2));
     System.out.println("INDEX OF: "+ip.indexOf("o"));
     System.out.println("SUBSTRING: "+ip.substring(0, 4));
    }    
}
