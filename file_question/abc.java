//WAP to read the string and write it in to the target file 
// package file_question;

import java.io.FileOutputStream;
import java.io.IOException;

class abc {
    public static void main(String[] args) {
        String s="Hello World";
        try {
            FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
            byte b[]=s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
