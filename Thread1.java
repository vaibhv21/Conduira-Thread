//Vaibhav
//Created Thread using Thread class Method And Print The Thread Name

public class Thread1 extends Thread
{
    public void run()
    {
        System.out.println("The Thread Name is : "+Thread.currentThread().getName());
    }
    public static void main(String[] args)
    {
        Thread1 t1=new Thread1();
        t1.start();

    }
}