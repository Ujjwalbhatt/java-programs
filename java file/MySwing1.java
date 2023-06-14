import javax.swing.*;
import java.awt.*;//  
import java.util.LinkedList;
public class MySwing1 extends JFrame
{
MySwing1()
{

JLabel l1=new JLabel("First Name");
JLabel l2=new JLabel("Second Name");
JTextField tf1=new JTextField("Example: Ujjwal");
JTextField tf2=new JTextField("Example: Bhatt");
setLayout(new FlowLayout());
add(l1);
add(tf1);
add(l2);
add(tf2);

String s[]={"India","Nepal","Bhutan"};

JComboBox cb=new JComboBox(s);  // dropdown list

add(cb);

JCheckBox c1=new JCheckBox();

JCheckBox c2=new JCheckBox("10th");
JCheckBox c3=new JCheckBox("12th",true);
add(c1);
add(c2);
add(c3);

JRadioButton rb1=new JRadioButton();
JRadioButton rb2=new JRadioButton("CSE");
JRadioButton rb3=new JRadioButton("EC",true);
ButtonGroup bg=new ButtonGroup();
bg.add(rb1);
bg.add(rb2);
bg.add(rb3);
add(rb1);
add(rb2);
add(rb3);
DefaultListModel<String> d=new DefaultListModel<>();
d.addElement("India");
d.addElement("Nepal");
d.addElement("Bhutan");
JList<String> list=new JList<>(d);
add(list);

JButton b1=new JButton("Submit");
add(b1);

JTextArea ta=new JTextArea(10,20);// rows,cols
add(ta);

JScrollBar jb=new JScrollBar(JScrollBar.HORIZONTAL,10,50,0,1000);
add(jb);

String data[][]={{"1","Raj","1000"},{"2","Ravi","2000"}};
String col[]={"ID","NAME","SALARY"};
JTable jtb=new JTable(data,col);
JScrollPane sp=new JScrollPane(jtb);
add(sp);
}
public static void main(String args[])
{
MySwing1 d=new MySwing1();
d.setSize(300,400);
d.setVisible(true);
}

}