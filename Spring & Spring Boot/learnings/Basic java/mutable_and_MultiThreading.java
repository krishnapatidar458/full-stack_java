import java.lang.Thread;

class counter {
    int count;
    public synchronized void increment()
    {
        count++;
    }
}

public class mutable_and_MultiThreading {

    public static void main(String[] args) throws InterruptedException{

        counter c = new counter();

        Runnable obj1 = () -> 
        {
            for (int i = 1; i <= 100000; i++) 
            {
                c.increment();
            }
        };
        Runnable obj2 = () -> 
        {
            for (int i = 1; i <= 100000; i++)
            {
                c.increment();
            }
        };

        Thread t2 = new Thread(obj1);
        Thread t1 = new Thread(obj2);

        
        t2.start();
        t1.start();
        
        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
