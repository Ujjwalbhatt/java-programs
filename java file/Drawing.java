//Remove the comments one by one and run the program.
import java.awt.*;
import javax.swing.*;
public class Drawing extends Canvas
{
public void paint(Graphics g)
{
setBackground(Color.GREEN);
setForeground(Color.RED);
//g.drawString("Hello",100,200);// string,x,y
//g.drawRect(10,20,100,200);// x,y,width,height
//g.fillRect(10,20,100,200);// x,y,width,height
//g.drawOval(10,20,100,200); // x,y,width,height
//g.fillOval(10,20,100,200); // x,y,width,height
//g.drawLine(40,50,100,200);// x1,y1,x2,y2
//g.drawArc(35, 45, 75, 95, 0, 90); //int x, int y, int width, int length, int startAngle, int arcAngle
//g.fillArc(35, 45, 75, 200, 0, 90);
int [ ] x = {20, 35, 50, 65, 80, 95};
int [ ] y = {60, 105, 105, 110, 95, 95};
//g.drawPolygon(x, y, 6);
g.fillPolygon(x, y, 6);
}
public static void main(String args[])
{
Drawing d=new Drawing ();
JFrame f=new JFrame();
f.add(d);
f.setSize(300,400);
f.setVisible(true);
}
}