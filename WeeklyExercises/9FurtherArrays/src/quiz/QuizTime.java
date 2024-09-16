package quiz;

public class QuizTime {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.addQuestion("What is the capital of France?", "Paris");
        quiz.addQuestion("What is 2 + 2?", "4");
        quiz.addQuestion("Who wrote Hamlet?", "William Shakespeare");

        quiz.giveQuiz();
    }
}
