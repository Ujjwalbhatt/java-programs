import java.io.*;
class fileread
{
public static void main(String args[])throws IOException
{
FileInputStream fis=new FileInputStream("A.txt");
InputStreamReader isr=new InputStreamReader(fis);
BufferedReader br=new BufferedReader(isr);

int t=0;
while((t=br.read())!=-1)
{
System.out.print((char)t);
}
br.close();
isr.close();

}
}
