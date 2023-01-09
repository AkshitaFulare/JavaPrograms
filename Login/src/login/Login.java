/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Login extends JFrame 
{
    JTextField t1,t2;
    JButton b1;
    JLabel l1,l2;
    Login() 
    {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
     
        l1=new JLabel("Login");
        l1.setFont(new Font("times New Roman",Font.BOLD,30));
        l1.setForeground(Color.darkGray);
        l1.setBounds(420,10,300,30);
        add(l1);

        t1= new JTextField(60);
        t2= new JPasswordField(60);
        b1= new JButton("SignIn");

        t1.setBounds(400,60,120,30);
        t2.setBounds(400,100,120,30);
        b1.setBounds(420,140,80,30);

        l2 =  new JLabel("");
        l2.setBounds(250,80,100,30);
        add(l2);

        add(t1);
        add(t2);
        add(b1);
       /* b1.addActionListener(new ActionListener()
        {
            public void actionPerfromed(ActionEvent ae)
            {
                if( t1.getText().toString().equals("admin") && t2.getText().toString().equals("admin") )
                 l2.setText("welcome"); 
                else
                l2.setText("Invalid UserName or Password");
            }
        });*/
    } 
}

  
    class LoginDemo{ 
    public static void main(String[] args) {
        Login l = new Login();
        l.setBounds(330,200,900,500);
        l.setVisible(true);
    }
}
