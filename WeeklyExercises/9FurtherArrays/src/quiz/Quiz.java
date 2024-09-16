package quiz;

import java.util.Scanner;

class Quiz {
    private static final int MAX_QUESTIONS = 25;
    private Question[] questions;
    private int currentIndex;

    public Quiz() {
        questions = new Question[MAX_QUESTIONS];
        currentIndex = 0;
    }

    public void addQuestion(String question, String answer) {
        if (currentIndex < MAX_QUESTIONS) {
            questions[currentIndex++] = new Question(question, answer);
        } else {
            System.out.println("Maximum number of questions reached.");
        }
    }

    public void giveQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < currentIndex; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i].getQuestion());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(questions[i].getAnswer())) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is: " + questions[i].getAnswer());
            }
        }

        System.out.println("Quiz completed. Your score: " + score + "/" + currentIndex);
    }
}

