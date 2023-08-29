package projects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateGenerator  implements ActionListener {
    JFrame frame;
    JLabel label;
    JButton btn;
    String formattedDateTime;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public DateGenerator(){
        frame = new JFrame("Date Time Generator");
        btn = new JButton("Click");
        label = new JLabel("Check the time");

        btn.addActionListener(this);

        frame.add(label);
        frame.add(btn);
        frame. setLayout(new FlowLayout(FlowLayout.CENTER, 20, 50));
        frame.setVisible(true);
        frame.setSize(400, 400);
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
