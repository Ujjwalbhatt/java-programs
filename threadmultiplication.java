// Write the program to create a thread to print multiplication table of 5.

import java.lang.Thread;

class thread1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("5 * "+i+" = "+5*i);
        }
    }
}

public class threadmultiplication {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        t1.start();
    }


    
}
