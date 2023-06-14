import java.util.Scanner;
class Xyz
{
    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);
            int a,b,c;
            System.out.print("Enter first number : ");
            a=sc.nextInt();
            System.out.print("Enter second number : ");
            b=sc.nextInt(); 
       try{

            c=a/b;

            System.out.println("result  "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("denominator can't be zero");
        }
    }
}
