import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.io.*;

 class examtest extends JFrame implements ActionListener {
        JFrame f;
        JLabel lb1,lb2;
        JTextField tf1,tf2;
        JButton b1;
       examtest(){
            f = new JFrame("Check box");
            setLayout(new FlowLayout());
            lb1 = new JLabel("Enter your name: ");
            lb2 = new JLabel("Enter your name: ");
            tf1 = new JTextField(30);
            tf2 = new JTextField(30);
            b1 = new JButton("Swap");
            add(lb1);
            add(lb2);
            add(tf1);
            add(tf2);
            add(b1);
            b1.addActionListener(this);
        }
        public void actionPerformed(ActionEvent e){
                String s1 = tf1.getText();
                String s2 = tf2.getText();
                tf1.setText(s2);
                tf2.setText(s1);
        }
        
}
class swapping{
    public static void main(String args[]){
            examtest obj = new examtest();
            obj.setSize(400, 400);
            obj.setVisible(true);
            obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
}
