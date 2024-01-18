package unit1;
import java.io.Console;

class looping
{
    static int i=1;
    public static void doWhile()
    {
        Console console=System.console();
        console.writer().println("WELCOME TO DO-WHILE");
        do
        {
            System.out.println(i);
            i++;
        }
        while(i<=3);
    }
}
class decision
{
    static String gender;
    public static void  validateGender()
    {
        Console con=System.console();
        gender=con.readLine("enter gender");
        if(gender=="queer")
        {
            System.out.println("you are vaanavil");
        }
        else
        {
            System.out.println("!!!!!");
        }
    }
}

class jump
{
    int i;
    jump()  //constructor
    {
        for(i=65;i<=70;i++)
        {
            if(i==69)
            {
                break;
            }
            System.out.println(i);
        }
    }
}
public class ControlStatements {
    public static void main(String[] ar) {
        looping.doWhile();
        decision.validateGender();
        jump o1=new jump();
    }
    
}
