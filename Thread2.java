//Vaibhav
//Created Thread using Runnable Interface Method And Print The Thread Name

public class Thread2 implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args)
    {
        Thread2 t2=new Thread2();
        Thread th=new Thread(t2);
        th.start();

    }
}