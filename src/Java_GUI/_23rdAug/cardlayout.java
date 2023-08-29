package Java_GUI._23rdAug;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cardlayout extends JFrame implements ActionListener {
    CardLayout cardLayout;
    Container container;

    JPanel panel1, panel2, panel3;
    JButton btn1, btn2, btn3;

    public cardlayout(){

        container = getContentPane();
        cardLayout = new CardLayout(30, 30);

        container.setLayout(cardLayout);

        btn1 = new JButton("Btn One");
        btn2 = new JButton("Btn Two");
        btn3 = new JButton("Btn Three");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel1.add(btn1);
        panel2.add(btn2);
        panel3.add(btn3);



        container.add("a", panel1);
        container.add("b", panel2);
        container.add("c", panel3);
    }
    public static void main(String[] args) {
        cardlayout layout = new cardlayout();

        layout.setSize(300, 300);
        layout.setVisible(true);
        layout.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cardLayout.next(container);
    }
}
