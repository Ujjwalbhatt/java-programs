//Write the gui program to swap two  numbers in java 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class abc extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton b1;

    abc(){
        setLayout(new FlowLayout());
        l1 = new JLabel("Enter first number");
        l2 = new JLabel("Enter second number");
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(20);
        JButton b1 = new JButton("Swap");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        b1.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
     String s1 = t1.getText();
        String s2 = t2.getText();
        t1.setText(s2);
        t2.setText(s1);

    }

}

class swapthenumber {
    public static void main(String[] args) {
        abc a = new abc();
        a.setSize(400, 400);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
