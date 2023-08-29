package Java_GUI._29thAug.quizApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizQuestion extends JFrame implements ActionListener {
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private JButton nextBtn;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    private JComboBox<String> comboBox3;
    private JComboBox<String> comboBox4;
    public QuizQuestion(){
        setTitle("Artificial Intelligence Quiz");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        nextBtn = new JButton("Next");

        nextBtn.addActionListener((ActionListener) this);

        createQuestionPanels();

        Container container = getContentPane();
        container.add(cardPanel, BorderLayout.CENTER);
        container.add(nextBtn, BorderLayout.SOUTH);

        showFirstQuestion();

        checkAnswers();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(600, 400);
//        Adding event listener
//        nextBtn.addActionListener(this);

    }

    private void createQuestionPanels() {
        String[] answer1 = {"Automation", "Web-based platform", "Open-source contribution", "Version control"};
        String[] answer2 = {"Chris Hemsworth", "Tom Preston-Werner", "Anslem Vegun", "Robert Kiyosaki"};
        String[] answer3 = {"Napoleon Bonaparte", "Frida Patrick", "Mark Anthony", "Macbeth"};
        String[] answer4 = {"Ladi kwali", "Funmi Ransome-Kuti", "Anikulapo Elizabeth", "Toke Ogunmola"};

        JPanel panel1 = createQuestionPanel("What does AI mean for developers?", answer1);
        JPanel panel2 = createQuestionPanel("Who invented GitHub?", answer2);
        JPanel panel3 = createQuestionPanel("Who is the first man to break a woman's heart?", answer3);
        JPanel panel4 = createQuestionPanel("What is the name of the first uneducated female doctorate holder in Nigeria?", answer4);

        cardPanel.add(panel1, "question1");
        cardPanel.add(panel2, "question2");
        cardPanel.add(panel3, "question3");
        cardPanel.add(panel4, "question4");
    }

    private JPanel createQuestionPanel(String question, String[] choices) {
        JPanel panel = new JPanel(new BorderLayout());

        JLabel questionLabel = new JLabel(question);
        panel.add(questionLabel, BorderLayout.NORTH);

        JComboBox<String> comboBox = new JComboBox<>(choices);
        panel.add(comboBox, BorderLayout.CENTER);

        return panel;
    }

    private void showFirstQuestion() {
        cardLayout.show(cardPanel, "question1");
    }

    private int getSelectedAnswer(JComboBox<String> comboBox) {
        return comboBox.getSelectedIndex();
    }
    private void checkAnswers() {
        int answer1 = getSelectedAnswer(comboBox1);
        int answer2 = getSelectedAnswer(comboBox2);
        int answer3 = getSelectedAnswer(comboBox3);
        int answer4 = getSelectedAnswer(comboBox4);

        // Check the answers
        if (answer1 == 0 && answer2 == 1 && answer3 == 0 && answer4 == 1) {
            JOptionPane.showMessageDialog(this, "Congratulations! You answered all questions correctly!");
        } else {
            JOptionPane.showMessageDialog(this, "Oops! Some answers are incorrect. Please try again.");
        }
    }
    public static void main(String[] args) {
        new QuizQuestion();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cardLayout.next(cardPanel);
    }

}
