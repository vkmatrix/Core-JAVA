import java.util.*;

class oneDimensioalArray
{
    int n;
    int sum=0;
    int a1d[];
    protected void getdynamicInput1D()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter num elements: ");
        n=s1.nextInt();
        a1d=new int[n];   // size assingnment
        System.out.println("enter them: ");
        for(int i=0;i<n;i++)
        {
            a1d[i]=s1.nextInt();
        }
    }
    protected void defaultInput1D()
    {
        a1d=new int[] {10,20,30,40,50};

    }
    protected void computeSum()
    {
        for(int i=0;i<a1d.length;i++)
        {
            sum=sum+a1d[i];
        }
        System.out.println(" SUM = "+sum);

    }

}
class multiDimensionalArray
{
    int nr,nc;
    int sum=0;
    int a2d[][];
    protected void getdynamicInput1D()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter num rows: ");
        nr=s1.nextInt();
        System.out.println("enter num cols: ");
        nc=s1.nextInt();
        a2d=new int[nr][nc];  // dimension assignment
        System.out.println("enter them row wise: ");
        for(int i=0;i<nr;i++)
        {
            for(int j=0;j<nc;j++)
            {
                a2d[i][j]=s1.nextInt();
            }
        }
    }
    protected void defaultInput2D()
    {
        a2d= new int[][] {{1,2,3},{4,5,6}};
    }
    protected void computeSum()
    {
        for(int i=0;i<a2d.length;i++)
        {
            for(int j=0;j<a2d[i].length;j++)
            {
                sum+=a2d[i][j];
            }
        }
        System.out.println("SUM = "+sum);
    }
}
public class Arrays {
    public static void main(String[] args)
    {
        System.out.println("1D Array with default values");
        oneDimensioalArray x=new oneDimensioalArray();
        x.defaultInput1D();
        x.computeSum();
        System.out.println("2D Array with user input values");
        multiDimensionalArray y =new multiDimensionalArray();
        y.getdynamicInput1D();
        y.computeSum();
    }
    
    
}
