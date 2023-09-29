import java.util.*;

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

class shift
{
    int num;
    shift()
    {
        System.out.println("enter number: ");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        int q=num<<2;
        System.out.println("left shift of "+ num+" = "+ q);
        q=num>>2;
        System.out.println("right shift of "+num+" = "+q);
    }
}

class arithmetic
{
    int age;
    arithmetic(int age)
    {
        this.age=age;
        if(age>=18)
        {
            System.out.println("adult");
        }
        else
        {
            System.out.println("minor");
        }
    }
}

class bitwise
{
    int a,b;
    bitwise(int a,int b)
    {
        this.a=a;
        this.b=b;
        int val;
        val=a&b;
        System.out.println("bitise AND = "+ val);
        val=a|b;
        System.out.println("bitwise OR = "+val);
        val=~a;
        System.out.println("bitwise NOT = "+val);
    }
}
class ternary extends bitwise
{
    ternary(int val1,int val2)
    {
        super(val1,val2);
        int res;
        res=(a>b)?a:b;
        System.out.println(res);
    }
}
public class Operators {
    public static void main(String[] args)
    {
        ternary t1=new ternary(2,0);

    }
    
}
