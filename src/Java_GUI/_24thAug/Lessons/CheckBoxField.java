package Java_GUI._24thAug.Lessons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxField  extends JFrame implements ActionListener {
    JCheckBox checkBox;
    JLabel label;
    JButton btn;
    public CheckBoxField(){
        checkBox = new JCheckBox();
        checkBox = new JCheckBox("I have read the terms and conditions");
        checkBox = new JCheckBox("I have read the terms and conditions", false);
        label = new JLabel("Check the box below to continue");
        btn = new JButton("Click");

        checkBox.setBounds(100,100, 300,50);
        label.setBounds(100,50, 300,50);
        btn.setBounds(100,150, 100,50);
        add(checkBox);
        add(label); add(btn);

        setLayout(null);
        setVisible(true);
        setSize(400,400);
    }
    public static void main(String[] args) {
        new CheckBoxField();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
