//Write the program to 

import java.util.*;
class producerconsumerpc{
  LinkedList<Integer> list = new LinkedList<>();
    int capacity = 2;
     void produce() throws InterruptedException{
        int data = 0;
        while(true){
            synchronized(this){
        while(list.size()==capacity){
            wait();
        }
        System.out.println("Going to produce");
        System.out.println("Item produced: "+data);
        list.add(data++);
        notify();
        Thread.sleep(1000);
    }
}
    }

    void consume() throws InterruptedException{
        while(true){
            synchronized(this){
        while(list.size()==0){
            wait();
        }
        int val = list.removeFirst();
        System.out.println("Going to consume");
        System.out.println("Item consumed: "+val);
        notify();
        Thread.sleep(1000);
    }
}

}
}
class A extends Thread {
    producerconsumerpc pc;
    A(producerconsumerpc pc){
        this.pc = pc;
    }
    public void run(){
        try{
            pc.produce();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class B extends Thread {
    producerconsumerpc pc;
    B(producerconsumerpc pc){
        this.pc = pc;
    }
    public void run(){
        try{
            pc.consume();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class producerconsumerpc5{
    public static void main(String[] args) {
        producerconsumerpc pc = new producerconsumerpc();
        A a = new A(pc);
        B b = new B(pc);
        a.start();
        b.start();
    }
}