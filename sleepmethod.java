// Write the programme too demonstrate the sleep method of thread class in for loop and use the exception handlink try catch.

import java.lang.Thread;
import java.util.*;
class thread1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("5 * "+i+" = "+5*i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class sleepmethod {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        t1.start();
    }
    
    
}


