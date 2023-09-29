class prefix
{
    int a=7;
    void newval()
    {
        System.out.println(a--);
    }
    

}
class postfix
{
    int a=7;
    void newval()
    {
        System.out.println(--a);
    }

}
public class Operators {
    public static void main(String[] args)
    {
        postfix p1=new postfix();
        p1.newval();
    }
    
}
