class hacker
{
    int a,b;
    // Default Constructor
    hacker()
    {
        
    }
    // Parameterized Constructor
    hacker(int p,int q)
    {
        a=p;
        b=q;
    }

}
public class Constructor {
    public static void main(String[] args)
    {
        //   ******* CONSTRUCTOR OVERLOADING *******

        // object1 using default constructor
        hacker h1=new hacker();
        System.out.println("value of a and b are "+ h1.a+" and "+h1.b);
        // object2 using parameterized constructor
        hacker h2=new hacker(10,20);
        System.out.println("value of a and b are "+ h2.a+" and "+h2.b);
    }
    
}
