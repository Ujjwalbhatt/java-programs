import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.io.*;

public class examtest {

        examtest(){
            JFrame f = new JFrame("Check box");
            JCheckBox cb1 = new JCheckBox("c++");
            cb1.setBounds(100, 150, 100, 50);
            f.add(cb1);
            f.setSize(400, 400);
            f.setLayout(null);
            f.setVisible(true);
        }
        public static void main(String args[]){

            examtest obj = new examtest();


        }
}
