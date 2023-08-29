package Java_GUI._24thAug.Lessons;

import javax.swing.*;
import java.awt.*;

public class ZooLogin {
    JFrame frame;
    JPanel panel;
    JLabel UsernameLabel;
    JLabel PasswordLabel;
    JTextField Username;
    JPasswordField Password;
    JLabel heading;
    JButton button;

     public ZooLogin(){
         frame = new JFrame("ZOOTOPIA - LOGIN");

         panel = new JPanel();

         heading = new JLabel("WELCOME TO ZOOTOPIA");
         heading.setFont(new Font("Arial", Font.BOLD, 10));

         Username = new JTextField();
         UsernameLabel = new JLabel("Username");
         Password = new JPasswordField();
         PasswordLabel = new JLabel("Password");
         button = new JButton("Login");

         frame.add(heading);
         heading.setBounds(0,0, 300,50);


         panel.add(UsernameLabel); panel.add(Username);
         panel.add(PasswordLabel); panel.add(Password);

         panel.setBounds(100,100, 400,350);
         panel.setLayout(new GridLayout(3, 2));
         frame.setLayout(null);
         frame.add(panel);
         frame.add(button);
         frame.setVisible(true);
         frame.setSize(400,400);
         frame.pack();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
    public static void main(String[] args) {
        new ZooLogin();
    }
}
