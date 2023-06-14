import java.awt.*;
import javax.swing.*;
class Drawing extends Canvas
{
    public void paint(Graphics g)
    {
        g.drawOval(100,50,200,200);
        setForeground(Color.BLACK);
        g.fillOval(140,110,30,40);
        g.fillOval(240,110,30,40);
        g.drawArc(155, 180, 90, 30, 180, 180);
    }
    public static void main(String args[])
    {
        Drawing d=new Drawing ();
        JFrame f=new JFrame();
        f.add(d);
        f.setSize(500,400);
        f.setVisible(true);
    }
}
