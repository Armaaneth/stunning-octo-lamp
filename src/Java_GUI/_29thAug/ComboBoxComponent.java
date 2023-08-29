package Java_GUI._29thAug;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxComponent {
    JFrame f;
    JButton  btn;
    JLabel label;
    public ComboBoxComponent(){
        f=new JFrame("ComboBox Example");
        String country[]={"India","Australia","U.S.A","England","New Zealand"};
        JComboBox cb=new JComboBox(country);
        btn = new JButton("Check");
        btn.setBounds(200,100,75,20);

        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        cb.setBounds(50, 100,90,20);
        f.add(cb);
        f.add(btn);
        f.add(label);
        f.setLayout(null);
        f.setSize(400,500);
        f.setVisible(true);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "Country Selected: "
                        + cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);
            }
        });

        }


    public static void main(String[] args) {
        new ComboBoxComponent();
    }
}