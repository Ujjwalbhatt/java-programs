// We will create a class that will implement Runnable and then pass it to some Thread for execution:

import java.lang.Thread; 
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
class thread3 implements Runnable{
    public void run(){
        System.out.println("Thread 3 is running");
    }
}
class thread4 implements Runnable{
    public void run(){
        System.out.println("Thread 4 is running");
    }
}

class runnableprog {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        thread3 t3=new thread3();
        thread4 t4=new thread4();
        Thread t11=new Thread(t1);
        Thread t22=new Thread(t2);
        Thread t33=new Thread(t3);
        Thread t44=new Thread(t4);
        t11.start();
        t22.start();
        t33.start();
        t44.start();
    }
    
}