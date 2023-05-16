//Wap a program to create a thread using Thread class and Runnable interface.
import java.lang.Thread;
import java.lang.Runnable;


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
class thread5 extends Thread{
    public void run(){
        System.out.println("Thread 5 is running");
    }
}

class thread1 implements Runnable{
    public void run(){
        System.out.println("Thread 1 is running");
    }
}
class thread2 implements Runnable{
    public void run(){
        System.out.println("Thread 2 is running");
    }
}


public class threadprog {
    public static void main(String[] args) {
        
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        thread3 t3=new thread3();
        thread4 t4=new thread4();
        thread5 t5=new thread5();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
    
}
