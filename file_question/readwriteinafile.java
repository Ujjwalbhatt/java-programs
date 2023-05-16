//WAP to enter the name,branch of the student and write it in to the target file
//Use InputStreamReader and BufferedReader
// package file_question;

import java.io.*;

public class readwriteinafile {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        FileWriter fw=new FileWriter("D:\\pqr.txt");
            BufferedWriter bw=new BufferedWriter(fw);
        System.out.println("Enter the name");
        String name=br.readLine();
        System.out.println("Enter the branch");
        String branch=br.readLine();
        bw.write(name+"\n");
        bw.write(branch+"\n");
        bw.close();
        fw.close();
        System.out.println("Your name is =  "+name +"\n"+"Your branch is = "+branch);
    }
    
}
