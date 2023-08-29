package Java_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateGenerator implements ActionListener {
    JFrame frame;
    JPanel panel;
    JButton btn;
    JLabel label;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String formattedDateTime;

    public DateGenerator(){
        frame = new JFrame("Current Date Formatter");
        panel = new JPanel();
        btn = new JButton("Click");
        label = new JLabel("Check the time");

        panel.add(btn); panel.add(label);
        btn.addActionListener(this);
        panel.setPreferredSize(new Dimension(200, 200));


        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.add(panel);
        frame.setVisible(true);
        frame.pack();


    }

    public static void main(String[] args) {
        new DateGenerator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        formattedDateTime = currentDateTime.format(FORMATTER);
        label.setText("The date and time is " + formattedDateTime);

    }
}
