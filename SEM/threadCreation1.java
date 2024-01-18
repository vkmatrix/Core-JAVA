// EXTENDING  THREAD CLASS

class MyThread extends Thread
{
    public void run()
    {
        System.out.println("thread created");
    }
}

public class threadCreation1 {
   public static void main(String[] ar)
   {
        MyThread t1=new MyThread();
        t1.start();
   }
    
}
