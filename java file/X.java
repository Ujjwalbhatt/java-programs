// Synchronized method

class Pqr
{
synchronized void table(int x)
{

for(int i=1;i<=5;i++)
{
System.out.println(i*x);
try{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println(e);
}}


}
}

class A extends Thread
{
Pqr d;
A(Pqr d)
{
this.d=d;
}
public void run()
{
d.table(5);
}
}
class B extends Thread
{
Pqr d;
B(Pqr d)
{
this.d=d;
}
public void run()
{
d.table(6);
}
}

class X
{
public static void main(String args[])
{
Pqr d=new Pqr();
A t1=new A(d);
t1.start();
B t2=new B(d);
t2.start();
}

}




