package unit1;
import java.util.*;
class SingleDim
{
    static int[] y=new int[10];
    public static void assign1d()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter "+y.length+" elements:");
        for(int i=0;i<y.length;i++)
        {
            y[i]=s.nextInt();
        }
        for(int i=0;i<y.length;i++)
        {
            System.out.print(y[i]+"\t");
        }
    }

}

class MultiDim
{
    static int[][] x=new int[2][2];
    public static void assigmd() 
    {
        Scanner s1=new Scanner(System.in);
        for(int i=0;i<x.length;i++)
        {
            int t=i+1;
            System.out.println("ENTER ELEMENTS OF ROW: "+ t);
            for(int j=0;j<x[i].length;j++)
            {
                x[i][j]=s1.nextInt(); 
            }
        }
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                System.out.print(x[i][j]+"\t");
            }
            System.out.println();
        }

    }
}

public class Arrays 
{
    public static void main(String[] args) 
    {
        MultiDim.assigmd();
    }    
}
