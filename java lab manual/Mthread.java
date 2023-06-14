class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Running " + Thread.currentThread().getName());
    }
}
class Mthread extends Thread
{
    public static void main(String args[])
    {
        MyRunnable a=new MyRunnable();
        Thread t1=new Thread(a);
        MyRunnable b=new MyRunnable();
        Thread t2=new Thread(b);


        t1.setPriority(10);
        t2.setPriority(3);

        System.out.println("Thread 1    Name:"+t1.getName()+" Priority:"+t1.getPriority());
        System.out.println("Thread 2    Name:"+t2.getName()+" Priority:"+t2.getPriority());
    }
}
