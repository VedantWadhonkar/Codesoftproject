import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int roundsPlayed = 0;
        int roundsWon = 0;

        System.out.println("What is your name?");
        String name = v.nextLine();

        System.out.println("Well, " + name + ", let's play a guessing game!");

        while (true) {
            System.out.println("I am thinking of a number between 1 to 100.");
            int mynumber = getRandomNumber(1, 100);
            boolean guessedCorrectly = false;

            for (int i = 0; i < 6; i++) {
                System.out.println("Take a guess (" + (6 - i) + " attempts left):");
                int yourGuess = v.nextInt();

                if (yourGuess == mynumber) {
                    System.out.println("You guessed correctly!");
                    guessedCorrectly = true;
                    roundsWon++;
                    break;
                } else if (yourGuess < mynumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }

                if (i >= 5) {
                    System.out.println("Nope, the number I was thinking of was " + mynumber + "!");
                }
            }

            roundsPlayed++;

            System.out.println("Do you want to play another round? (yes/no)");
            v.nextLine();
            String playAgain = v.nextLine();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Game over, " + name + "!");
        System.out.println("You played " + roundsPlayed + " round(s) and won " + roundsWon + " round(s).");
        v.close();
    }

    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
