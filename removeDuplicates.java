import java.util.Scanner;

class r1{  
    public static int removeDuplicateElements(int arr[], int n){  
         if (n==0 || n==1){  
            return n;  
        }    
        int j = 0;  //for next element
        for (int i=0; i < n-1; i++){  
            if (arr[i] != arr[i+1]){  
                arr[j++] = arr[i];  
            }  
        }  
        arr[j++] = arr[n-1];  
        return j;  
    }  
}
public class removeDuplicates {
    public static void main(String[] args)
    {
        int n;
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the number of elements: ")
        n=s1.nextInt();
        int arr[]=new int[n];
        System.out.println("enter them: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=s1.nextInt();
        }
        System.out.println("the array after removing the duplicates are: ");
        r1 obj=new r1();
        r1.removeDuplicateElements(arr, n;)

    }
    
}
