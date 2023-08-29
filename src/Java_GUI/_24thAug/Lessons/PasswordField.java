package Java_GUI._24thAug.Lessons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordField extends JFrame implements ActionListener {
    JPanel panel;
    JPasswordField passwordField;
    JButton btn;
    JLabel label;
    String text;
    public  PasswordField(){
        panel = new JPanel();
        passwordField = new JPasswordField();
        passwordField = new JPasswordField(10);
        passwordField = new JPasswordField("Enter your Password");
        passwordField = new JPasswordField("Enter Password", 10);

        btn = new JButton("Click");
        btn.addActionListener(this);
        label = new JLabel("Welcome to Zootopia");

//        panel.add(label, BorderLayout.WEST);panel.add(passwordField, BorderLayout.CENTER); panel.add(btn, BorderLayout.EAST);
//        panel.setLayout(new BorderLayout());
        panel.add(label); panel.add(passwordField); panel.add(btn);
        add(panel);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setVisible(true);
        setSize(400,400);
        setTitle("Widget - JPassword Field");
    }

    public static void main(String[] args) {
        new PasswordField();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        text = new String(passwordField.getPassword());
        label.setText("The pasword is " + text);
    }
}
