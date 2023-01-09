/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testawt;

import javax.swing.*;
import java.awt.*;

class Testawt  extends JFrame {
    
    Testawt()
    {
      setSize(1400,700); 
      setLayout(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      ImageIcon background_image = new ImageIcon("Login1.jpg");
      JLabel background = new JLabel("",background_image,JLabel.CENTER);
      background.setBounds(0,0,900,600);
      add(background);
      
      setVisible(true);
    }

    
    public static void main(String[] args) {
        
    }
    
}
