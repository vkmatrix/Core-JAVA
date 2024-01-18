package unit1;
import java.util.Scanner;

// static keyword is used for memory management
// static members can be invoked without creating object

class Example
{
    static int age=69;   // static variable

    public static void say()     // static method
    {
        System.out.println("poda punda");
    }
    static                      // static block
    {
        System.out.println("welcome to static block da bunda!!!!!");   
    }
}

public class statics {
    public static void main(String[] ar) 
    {
     System.out.println("default value of static variable: "+Example.age);   
     Example.say();
    }
    
}
