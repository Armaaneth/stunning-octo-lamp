package projects.quiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class QuizQuestion {
    private String question;
    private String[] choices;
    private int correctAnswerIndex;

    public QuizQuestion(String question, String[] choices, int correctAnswerIndex) {
        this.question = question;
        this.choices = choices;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getChoices() {
        return choices;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}

class Quiz {
    private List<QuizQuestion> questions;
    private int currentQuestionIndex;
    private int score;

    public Quiz(List<QuizQuestion> questions) {
        this.questions = questions;
        this.currentQuestionIndex = 0;
        this.score = 0;
    }

    public QuizQuestion getCurrentQuestion() {
        return questions.get(currentQuestionIndex);
    }

    public void answerCurrentQuestion(int selectedAnswerIndex) {
        QuizQuestion currentQuestion = getCurrentQuestion();
        if (selectedAnswerIndex == currentQuestion.getCorrectAnswerIndex()) {
            score++;
        }
        currentQuestionIndex++;
    }

    public boolean hasNextQuestion() {
        return currentQuestionIndex < questions.size();
    }

    public int getScore() {
        return score;
    }
}

class QuizGUI extends JFrame {
    private Quiz quiz;
    private JLabel questionLabel;
    private JRadioButton[] choiceButtons;
    private JButton nextButton;
    private ButtonGroup buttonGroup;

    public QuizGUI(Quiz quiz) {
        this.quiz = quiz;
        initializeComponents();
        setupLayout();
        displayNextQuestion();
    }

    private void initializeComponents() {
        questionLabel = new JLabel();
        choiceButtons = new JRadioButton[4];
        buttonGroup = new ButtonGroup();
        nextButton = new JButton("Next");

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processAnswer();
                if (quiz.hasNextQuestion()) {
                    displayNextQuestion();
                } else {
                    showQuizResults();
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setupLayout() {
        setLayout(new GridLayout(6, 1));

        add(questionLabel);

        for (int i = 0; i < choiceButtons.length; i++) {
            choiceButtons[i] = new JRadioButton();
            buttonGroup.add(choiceButtons[i]);
            add(choiceButtons[i]);
        }

        add(nextButton);

        pack();
        setLocationRelativeTo(null);
    }

    private void displayNextQuestion() {
        QuizQuestion currentQuestion = quiz.getCurrentQuestion();
        questionLabel.setText(currentQuestion.getQuestion());

        String[] choices = currentQuestion.getChoices();
        for (int i = 0; i < choiceButtons.length; i++) {
            choiceButtons[i].setText(choices[i]);
            choiceButtons[i].setSelected(false);
        }
    }

    private void processAnswer() {
        for (int i = 0; i < choiceButtons.length; i++) {
            if (choiceButtons[i].isSelected()) {
                quiz.answerCurrentQuestion(i);
                break;
            }
        }
    }

    private void showQuizResults() {
        JOptionPane.showMessageDialog(this, "Quiz complete! Your score is: " + quiz.getScore());
        System.exit(0);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create quiz questions
        List<QuizQuestion> questions = new ArrayList<>();
        // Add the quiz questions here
        QuizQuestion question1 = new QuizQuestion("Who is the first man to break a woman's heart?", new String[]{"Napoleon Bonaparte", "Richard Burton", "Romeo", "Mark Anthony"}, 0);
        questions.add(question1);
        QuizQuestion question2 = new QuizQuestion("Who invented github? ", new String[]{"Frida Kahle", "Tom Preston-Werner", "Murkiness Anderson", "Elizabeth Taylor"}, 1);
        questions.add(question2);
        QuizQuestion question3 = new QuizQuestion("Who invented Javascript", new String[]{"Napoleon Bonaparte", "Brendan Eich", "Romeo", "Mark Anthony"}, 1);
        questions.add(question3);
        QuizQuestion question4 = new QuizQuestion("The first person to access youtube?", new String[]{"Napoleon Bonaparte", "Richard Burton", "Romeo", "Jawed Karim"}, 3);
        questions.add(question4);
        // ...

        // Create quiz
        Quiz quiz = new Quiz(questions);

        // Create and show the GUI

            QuizGUI quizGUI = new QuizGUI(quiz);
            quizGUI.setVisible(true);

    }
}