package unit2;
import java.util.*;
class A  //superclass
{   
    int id;
    String name;
    float sub1,sub2,sub3;
    A(int a,String b,float s1,float s2,float s3)
    {
        id=a;
        name=b;
        sub1=s1;
        sub2=s2;
        sub3=s3;
    }
}
class B extends A  // subclass
{

    B(int a,String b,float s1,float s2,float s3)
    {
        super(a,b,s1,s2,s3);  // super keyword to invoke constructor of A from constructor B
    }

    public float computeAvg()
    {
        return (sub1+sub2+sub3)/3;
    }
}

public class SuperKeyword 
{
    public static void main(String[] ar) 
    {
        B o1=new B(69,"ALMAS",69.0F,79.0F,70.0F);  
        System.out.println(o1.computeAvg());
    }    
}
