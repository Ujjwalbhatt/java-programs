//Write the programme to read the data of the file and output it in the screen reading the data of the file
import java.io.*; 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class abs {

    public static void main(String args[]) throws IOException
        {
            FileInputStream fin = new FileInputStream("D:\\testout.txt");
            BufferedInputStream bis=new BufferedInputStream(fin);
            FileOutputStream fout=new FileOutputStream("D:\\pqr.txt");
            BufferedOutputStream bos=new BufferedOutputStream(fout);
            int x=0;
              while ((x=bis.read() )!= -1)
              {
                System.out.print((char)x);
                bos.write(x);
              }
                bis.close();
                fin.close();
                bos.close();
                fout.close();
    }
}


