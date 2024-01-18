package unit2;

abstract class sample1  // abstract class
{
    int n;
    sample1()
    {
        n=10;
    }
    abstract void sayHi(); // abstract method
}

class sample2 extends sample1
{
    @Override
    void sayHi()
    {
        System.out.println("hello from overridden method of superclass");
    }
}

public class AbstractKeyword {
    public static void main(String[] ar) {
        sample2 o1=new sample2();
        o1.sayHi();
    }
    
}
