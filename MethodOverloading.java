class cl1
{
    int a,b,c;
    // sum with 2 numbers
    int sum(int a,int b)
    {
        return a+b;
    }
    // float with 3 numbers
    float sum(float a,float b,float c)
    {
        return a+b+c;
    }
}
public class MethodOverloading
{
    public static void main(String[] args)
    {
        cl1 o1=new cl1();
        System.out.println("the sum of 2 int numbers is -> "+o1.sum(1,2));
        System.out.println("the sum of 3 float numbers is -> "+o1.sum(1.0F,2.0F,3.0F));
    }
}