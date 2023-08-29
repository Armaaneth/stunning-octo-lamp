package projects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;

public class randomNum implements ActionListener {
    JFrame frame;
    JLabel label;
    JButton btn;
    public static final SecureRandom SECURE_RANDOM = new SecureRandom();
    int randomnumber;

    public randomNum(){
        frame = new JFrame("Random Number Generator");
        btn = new JButton("Click");
        label = new JLabel("Generate a number");

        btn.addActionListener(this);

        frame.add(label);
        frame.add(btn);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 50));
        frame.setSize(400,400);
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        new randomNum();
    }

    private static int randomNumber(int maximum) {
        return SECURE_RANDOM.nextInt(maximum - 50) + 50;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        randomnumber = randomNumber(100);
        label.setText("Number generated is: " + randomnumber);
    }
}
