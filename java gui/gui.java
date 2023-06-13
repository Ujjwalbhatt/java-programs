///Write a program in java to amke the form with the following fields:
//Name
//Address
//Phone
//Email
// submit button
// reset button

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class gui {
    public static void main(String[] args) {
      
        JFrame f = new JFrame("Form");
        JLabel l1,l2,l3,l4;
        JTextField t1,t2,t3,t4;
        JButton b1,b2;
        l1 = new JLabel("Name");
        l1.setBounds(50,50,100,30);
        l2 = new JLabel("Address");
        l2.setBounds(50,100,100,30);
        l3 = new JLabel("Phone");
        l3.setBounds(50,150,100,30);
        l4 = new JLabel("Email");
        l4.setBounds(50,200,100,30);
        t1 = new JTextField();
        t1.setBounds(150,50,100,30);
        t2 = new JTextField();
        t2.setBounds(150,100,100,30);
        t3 = new JTextField();
        t3.setBounds(150,150,100,30);
        t4 = new JTextField();
        t4.setBounds(150,200,100,30);
        b1 = new JButton("Submit");
        b1.setBounds(50,250,100,30);
        b2 = new JButton("Reset");
        b2.setBounds(150,250,100,30);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(b1);
        f.add(b2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    
}
