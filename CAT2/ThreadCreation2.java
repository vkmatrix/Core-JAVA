class StudentRunnable extends Exception implements Runnable
{
    private String studentName;
    public StudentRunnable(String name)
    {
        this.studentName=name;
    }
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(studentName+" is studying for "+i+" hours.");
            try
            {
                System.out.println("BREAK TIME = "+1000*i+"ms......");
                Thread.sleep(1000*i);
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }

    }
}

public class ThreadCreation2 {
    public static void main(String[] ar)
    {
        StudentRunnable o1=new StudentRunnable("toyboy");
        Thread o1Thread=new Thread(o1);
        o1Thread.run();
    }
    
}
