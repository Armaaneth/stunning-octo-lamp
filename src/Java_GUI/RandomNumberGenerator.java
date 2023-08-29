package Java_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;

public class RandomNumberGenerator implements ActionListener {
    JFrame frame;
     JPanel panel;
    private JLabel label;
    private JButton btn;
    public static final SecureRandom SECURE_RANDOM = new SecureRandom();
    int randomNum;


    public RandomNumberGenerator(){
            frame = new JFrame("Random Number Generator");
            panel = new JPanel();

            label = new JLabel("Generating a random number between  100 and 200");

            btn = new JButton("Click!");
            btn.addActionListener(this);
            panel.add(label); panel.add(btn);
            panel.setPreferredSize(new Dimension(300, 100));

            panel.setLayout(new FlowLayout(FlowLayout.CENTER));
            frame.add(panel);
            frame.pack();
            frame.setVisible(true);


    }
    public static void main(String[] args) {
            new RandomNumberGenerator();
    }

    private static int randomNumber(int maximum) {
        return SECURE_RANDOM.nextInt(maximum - 50) + 50;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            randomNum = randomNumber(100);
            label.setText("Number generated is: " + randomNum);
            btn.setVisible(false);
    }
}
