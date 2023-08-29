package Java_GUI;

import javax.swing.*;
import java.awt.*;

public class Pictorials {
    JFrame frame;
    JPanel panel;
    private JLabel label1;
    private JLabel label2;
    private JButton btn1;
    private JButton btn2;

    public Pictorials(){
        frame = new JFrame("Random Number Generator");
        panel = new JPanel();

        ImageIcon img1 = new ImageIcon("https://img.freepik.com/free-vector/flat-illustration-secretary-s-day-celebration_23-2150225886.jpg?w=740&t=st=1692772153~exp=1692772753~hmac=6c21aceabfa373cab63fd54cf405b408dce7f55399f5d2905ee2213c022ab956");
//        ImageIcon img2 = new ImageIcon("https://img.freepik.com/free-vector/hand-drawn-people-talking-phone-illustration_23-2149917130.jpg?size=626&ext=jpg&ga=GA1.1.572377169.1683529692&semt=ais");

        label1 = new JLabel(img1);
//        label2 = new JLabel(img2);

        panel.add(label1);
//        panel.add(label2);

        panel.setLayout(new BorderLayout());

        // Set the size of the frame based on the image size
        label1.setSize(img1.getIconWidth(), img1.getIconHeight());

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Pictorials();
    }
}

/*
*
* public void actionPerformed(ActionEvent e){
    String url=tf.getText();
    try {
        InetAddress ia=InetAddress.getByName(url);
        String ip=ia.getHostAddress();
        JOptionPane.showMessageDialog(this,ip);
    } catch (UnknownHostException e1) {
        JOptionPane.showMessageDialog(this,e1.toString());
    }
}
* */