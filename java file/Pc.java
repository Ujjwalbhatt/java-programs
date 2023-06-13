import java.util.LinkedList;
class Pc
{
LinkedList<Integer> list=new LinkedList<>();
int capacity=2;
public void produce() throws InterruptedException
{
int value=0;
while(true)
{
synchronized(this){
while(list.size()==capacity)
wait();
System.out.println("Going to produce......");
System.out.println("Item produced ="+value);
list.add(value++);

notify();
Thread.sleep(5000);
}
}

}// end of producer

public void consume() throws InterruptedException
{
while(true)
{
synchronized(this){
while (list.size()==0)
wait();
int value=list.removeFirst();
System.out.println("Item consumed ="+value);
notify();
Thread.sleep(5000);
}
}
}//end of consumer
}
class A extends Thread
{
Pc p;
A(Pc p)
{
this.p=p;
}
public void run() 
{
try{
p.produce();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
class B extends Thread
{
Pc p;
B(Pc p)
{
this.p=p;
}
public void run() 
{
try{
p.consume();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
class Xyz
{
public static void main(String args[]) throws InterruptedException
{
Pc p=new Pc();
A a=new A(p);
a.start();
B b=new B(p);
b.start();
a.join();
b.join();
}
}

/*
notify() It wakes up one single thread that called wait() on the same object. 
It should be noted that calling notify() does not actually give up a lock on a resource. 
It tells a waiting thread that that thread can wake up. 
However, the lock is not actually given up until the notifier's synchronized block has completed.
*/

/*
join(): When the join() method is invoked, the current thread stops its execution and the thread goes 
into the wait state. The current thread remains in the wait state until the thread on which the join() method 
is invoked has achieved its dead state.
*/