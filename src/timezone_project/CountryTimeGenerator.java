package timezone_project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class CountryTimeGenerator extends JFrame implements ActionListener {
    private JLabel countryLabel;
    private JComboBox<String> countryComboBox;
    private JButton generateButton;
    private JLabel timeLabel;

    private Map<String, String> countryZoneMap;

    public CountryTimeGenerator() {
        setTitle("Country Time Generator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        countryLabel = new JLabel("Select Country:");
        add(countryLabel);

        countryComboBox = new JComboBox<>();
        countryComboBox.addItem("Select a country");
        countryComboBox.addItem("United States");
        countryComboBox.addItem("United Kingdom");
        countryComboBox.addItem("India");
        countryComboBox.addItem("Australia");
        add(countryComboBox);

        generateButton = new JButton("Generate Time");
        generateButton.addActionListener(this);
        add(generateButton);

        timeLabel = new JLabel();
        timeLabel.setBackground(Color.PINK);
        add(timeLabel);

        countryZoneMap = new HashMap<>();
        countryZoneMap.put("United States", "America/New_York");
        countryZoneMap.put("United Kingdom", "Europe/London");
        countryZoneMap.put("India", "Asia/Kolkata");
        countryZoneMap.put("Australia", "Australia/Sydney");

        pack();
        setLocationRelativeTo(null);
        setFont(new Font("Arial", Font.BOLD, 15));

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == generateButton) {
            String selectedCountry = (String) countryComboBox.getSelectedItem();
            if (selectedCountry.equals("Select a country")) {
                JOptionPane.showMessageDialog(this, "Please select a country.");
                return;
            }

            String timeZoneId = countryZoneMap.get(selectedCountry);
            LocalDateTime currentTime = LocalDateTime.now(ZoneId.of(timeZoneId));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedTime = currentTime.format(formatter);

            timeLabel.setText("Current time in " + selectedCountry + ": " + formattedTime);
        }
    }

    public static void main(String[] args) {
            CountryTimeGenerator frame = new CountryTimeGenerator();
            frame.setVisible(true);
            frame.setSize(400,400);
    }
}