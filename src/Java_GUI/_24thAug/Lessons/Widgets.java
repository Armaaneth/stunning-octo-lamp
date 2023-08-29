package Java_GUI._24thAug.Lessons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Widgets extends JFrame implements ActionListener {
    JTextArea messageBox;
    JButton btn;
    JLabel label;
    String message;
    public Widgets(){
        //Constructors used with the text area component
        messageBox = new JTextArea();
        messageBox = new JTextArea("Enter your message");
//        messageBox = new JTextArea(3 , 4);
        messageBox = new JTextArea("Enter message", 5, 20);
        messageBox.setFont(new Font("Arial", Font.BOLD, 10));

        label = new JLabel("Enter your message");
        btn = new JButton(" Count");
        btn.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(label);
        add(messageBox);
        add(btn);
        setVisible(true);
        setSize(400,400);
        pack();
        setTitle("Using the textarea");
    }
    public static void main(String[] args) {
        new Widgets();
    }

    public int counter(String text){
        char[] textArray = text.toCharArray();
        return textArray.length;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        message = messageBox.getText();
        int length = counter(message);
        label.setText("The letters in the message box are " + length);
        messageBox.setVisible(false);
    }
}
