//Write the programe to enter the name of the person and age of the person and validate the age of the person and print "Welcome Mr. <name> or Mrs. <name> you are eligible to vote or not eligible to vote".
//make two listener one fo radio button of male and femal and other for button

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class abc extends JFrame implements ActionListener, ItemListener {
    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton b1;
    JRadioButton r1, r2;    
    ButtonGroup bg;
    JTextArea ta;
    String title;
    abc() {

        setLayout (new FlowLayout());
        l1 = new JLabel("Enter your name");
        l2 = new JLabel("Enter your age");
        l3 = new JLabel("Result");
        t1 = new JTextField(10);
        t2 = new JTextField(20);
        b1 = new JButton("Validate");
        r1 =new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        bg = new ButtonGroup();
        ta = new JTextArea(10, 20);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(r1);
        add(r2);
        add(b1);
        add(l3);
        add(ta);

        bg.add(r1);
        bg.add(r2);

        b1.addActionListener(this);
        r1.addItemListener(this);
        r2.addItemListener(this);
        


    }
    public void itemStateChanged(ItemEvent ie){
        if(r1.isSelected()){
            title = "Mr.";
        }
        else{
            title = "Mrs.";
        }
    }

    public void actionPerformed(ActionEvent ae) {
        String name = t1.getText();
        String age = t2.getText();
        int a = Integer.parseInt(age);
        if (a >= 18) {
            
            ta.setText("Welcome " +title + name + " you are eligible to vote");
        } else {
            ta.setText("Welcome " +title+ name + " you are not eligible to vote");
        }
        
    }
    

}
public class agevalidation {
    public static void main(String[] args) {
        abc obj = new abc();
        obj.setVisible(true);
        obj.setSize(400, 400);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
