// Write the program to create a thread to print multiplication table of 5.

import java.lang.Thread;

class Table{
 void run(){
    try{
        for(int i=1;i<=10;i++){
         System.out.println("5 * "+i+" = "+5*i);
         Thread.sleep(4000);
        }
    }
    catch
    (Exception e){
        System.out.println(e);
    }
 }
}

class thread1 extends Thread{
     public void run(){
        Table t=new Table();
        t.run();
    }
}

class thread2 extends Thread{
 synchronized public  void run(){
        Table t=new Table();
        t.run();
    }
}

class threadmultiplication {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        t1.start();
        thread2 t2=new thread2();
        t2.start();
    }
}
