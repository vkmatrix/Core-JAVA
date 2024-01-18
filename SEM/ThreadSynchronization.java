class Counter
{
    private int count=0;
    public synchronized void increment()  // SYN
    {
        count++;
    }
    public synchronized int getCount()   // SYN
    {
        return count;
    }
}

public class ThreadSynchronization
{
    public static void main(String[] ar) throws InterruptedException{
        Counter c=new Counter();
        Thread t1=new Thread(()->{for(int i=0;i<10;i++) c.increment();});
        Thread t2=new Thread(()->{for(int i=0;i<10;i++) c.increment();});
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("FINAL COUNT: "+ c.getCount());
    }
}

