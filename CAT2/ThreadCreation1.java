class StudentThread extends Thread
{
    private String studentName;
    public StudentThread(String stuname)
    {
        this.studentName=stuname;
    }
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(studentName+" is studying for "+i+" hours.");
            try
            {
                System.out.println("BREAK TIME = "+ 10000*i+" milliseconds");
                Thread.sleep(10000*i);   // for i hours 10000*i is rest time
            }
            catch(InterruptedException ie)
            {
                ie.printStackTrace();
            }

        }
    }
}

public class ThreadCreation1 {
    public static void main(String[] ar)
    {
        StudentThread alias=new StudentThread("alias");
        alias.run();
    }
    
    
}
