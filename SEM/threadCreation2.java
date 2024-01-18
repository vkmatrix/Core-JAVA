// IMPLEMENTING RUNNABLE INTERFACE

class myRunnable implements Runnable
{
    public void run()
    {
        System.out.println(" **  thread created via impelementing runnable interface  **");
    }
}

public class threadCreation2 {
        public static void main(String[] ar) {
            Thread t=new Thread(new myRunnable());
            t.start(); 
    }
    
}
