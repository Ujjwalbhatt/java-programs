class A extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("This is thread of class A and i= "+i);
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int j=0;j<10;j++)
        {
            System.out.println("This is thread of class B and j= "+j);
        }
    }
}
class C extends Thread
{
    public void run()
    {
        for(int k=0;k<10;k++)
        {
            System.out.println("This is thread of class C and k= "+k);
        }
    }
}
class X
{
    public static void main(String args[])
    {
        A t1=new A();
        t1.start();

        B t2=new B();
        t2.start();

        C t3=new C();
        t3.start();
    }
}
