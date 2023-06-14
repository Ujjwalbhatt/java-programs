import java.io.*;
class Xy
{
public static void main(String args[]) throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter your name");
String name=br.readLine();
System.out.println("Enter your Age");
String age=br.readLine();
System.out.println("Your name is:= "+name+" And Your Age is= "+age);
br.close();
isr.close();
}
}

