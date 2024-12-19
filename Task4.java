import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Task4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String[][] questions = {
            {"What is 2+2?", "a) 2", "b) 3", "c) 4", "d) 5"},
            {"What is the capital of India?", "a) New Delhi", "b) Mumbai", "c) Nagpur", "d) Calcutta"},
            {"What is the fastest land animal?", "a) Tiger", "b) Cheetah", "c) Giraffe", "d) Wolf"}
        };
        String[] answers = {"c", "a", "b"};
        String[] responses = new String[questions.length];
        int score = 0;

        final int TIME_LIMIT = 10;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i][0]);
            for (int j = 1; j <= 4; j++) {
                System.out.println(questions[i][j]);
            }

            long startTime = System.currentTimeMillis();
            String response = "";

            while ((System.currentTimeMillis() - startTime) < TIME_LIMIT * 1000) {
                if (sc.hasNext()) {
                    response = sc.next();
                    break;
                }
            }

            if (response.isEmpty()) {
                System.out.println("Time's up! Moving to the next question.");
            } else {
                responses[i] = response;
                if (responses[i].equalsIgnoreCase(answers[i])) {
                    score++;
                }
            }
            System.out.println();
        }

        System.out.println("Quiz Over!");
        System.out.println("Your Score: " + score + "/" + questions.length);

        System.out.println("\nCorrect Answers Summary:");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i][0]);
            System.out.println("Correct Answer: " + answers[i]);
            System.out.println("Your Answer: " + (responses[i] == null ? "No Response" : responses[i]));
            System.out.println();
        }
    }
}
