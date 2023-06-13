//Write the programme to get the priority of the thread and set the priority of the thread.

import java.lang.Thread;

class thread1 extends Thread{
    public void run(){
        System.out.println("Thread 1 is running");
    }
}
class thread2 extends Thread{
    public void run(){
        System.out.println("Thread 2 is running");
    }
}

class thread3 extends Thread{
    public void run(){
        System.out.println("Thread 3 is running");
    }
}

class thread4 extends Thread{
    public void run(){
        System.out.println("Thread 4 is running");
    }
}
public class threadpriority {
    
    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        thread3 t3=new thread3();
        thread4 t4=new thread4();

        t1.setPriority(5);
        t2.setPriority(10);
        t3.setPriority(7);
        t4.setPriority(6);
        
        System.out.println("Priority of thread 1 is "+t1.getPriority());
        System.out.println("Priority of thread 2 is "+t2.getPriority());
        System.out.println("Priority of thread 3 is "+t3.getPriority());
        System.out.println("Priority of thread 4 is "+t4.getPriority());
        System.out.println("Priority of " + Thread.currentThread().getName() +  "thread is "+Thread.currentThread().getPriority());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    } 


}
