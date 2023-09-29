import java.util.*;
public class MatrixSum {
    public static void main(String[] args)
    {
        Scanner s1 =new Scanner(System.in);
        int rows,cols,rowSum=0,colSum=0;
        System.out.println("enter the num of rows: ");
        rows=s1.nextInt();
        System.out.println("enter the num of cols: ");
        cols=s1.nextInt();
        int arr[][]=new int[rows][cols];
        System.out.println("enter them:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=s1.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                rowSum=rowSum+arr[i][j];
                colSum=colSum+arr[j][i];
            }
        }
        System.out.println("row sum=> "+rowSum);
        System.out.println("col sum=> "+colSum);
    }
    
}
