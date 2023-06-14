

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class abc extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton b1;
    JButton b2;

    abc() {
        setLayout(new FlowLayout());
        l1 = new JLabel("Enter first number");
        l2 = new JLabel("Enter second number");
        l3 = new JLabel("Result");
        t1 = new JTextField(10);
        t2 = new JTextField(20);
        b1 = new JButton("+");
        b2 = new JButton("-");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
      String s = e.getActionCommand();
        if(s.equals("+")){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a + b;
            l3.setText("Result is " + c);
        }
        else if(s.equals("-")){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a - b;
            l3.setText("Result is " + c);
        }
    }
}

class addtwonumbers {
    public static void main(String[] args) {
        abc a = new abc();
        a.setSize(400, 400);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
 


