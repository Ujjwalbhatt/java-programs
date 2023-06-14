import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Abc1 extends JFrame implements ActionListener{
    JTextField tf1,tf2,tf3;
    Abc1()
    {  
        JLabel l1=new JLabel("First Number");
        JLabel l2=new JLabel("Second Number");
        JLabel l3=new JLabel("Result");
        tf1=new JTextField(20);
        tf2=new JTextField(20);
        tf3=new JTextField(20);
        setLayout(new FlowLayout());
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        JCheckBox c1=new JCheckBox();
        JRadioButton rb1=new JRadioButton("SUM");
        JRadioButton rb2=new JRadioButton("SUBTRACTION");
        ButtonGroup bg=new ButtonGroup();
       rb1.addActionListener(this);
        rb2.addActionListener(this);
        bg.add(rb1);
        bg.add(rb2);
        add(rb1);
        add(rb2);
    }
    public void actionPerformed(ActionEvent e)
    {
       String s=e.getActionCommand();
        int x=Integer.parseInt(tf1.getText());
        int y=Integer.parseInt(tf2.getText());
        int z=0;
        if(s.equals("SUM")){
            z=x+y;
            tf3.setText(Integer.toString(z));
        }
        if(s.equals("SUBTRACTION"))
        {
            z=x-y;
            tf3.setText(Integer.toString(z));
 }
    }
    public static void main(String args[])
    {
        Abc1 a=new Abc1();
        a.setSize(400,400);
        a.setVisible(true);
    }
}

