
package myframework;

import javax.swing.*;
import java.awt.*;
public class MyFrameWork extends JFrame{

    MyFrameWork()
    {
        setSize(1193,636);
        setLocation(145,120);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.white);
        p1.setBounds(0,0,1193,636);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Login2.png"));
        Image i2 = i1.getImage().getScaledInstance(1193, 636, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1193, 636);
        p1.add(image);
        
        setVisible(true);
        
    }        
    public static void main(String[] args) {
       new  MyFrameWork();
    }
    
}
