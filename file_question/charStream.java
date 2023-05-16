//Write a programme to Read and Write the file using character stream 
// package file_question;
import java.io.*;
class charStream {

    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("D:\\testout.txt");
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw=new FileWriter("D:\\pqr.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        String x;
        while((x=br.readLine())!=null) {
            System.out.println(x);
            bw.write(x+"\n");
        }
        br.close();
        fr.close(); 
        bw.close();
        fw.close();
    }
}
