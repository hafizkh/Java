import java.util.Scanner;

public class loopAdv {
    public static void main(String[] args) {
        String correctAnswer = "Emma";
        Scanner scanner = new Scanner(System.in);
        int numberOfGuesses = 0;

        System.out.println("Guess my name (type 'stop' to exit)");

        while (true) {
            String userGuess = scanner.nextLine();
            numberOfGuesses++;

            if (userGuess.equalsIgnoreCase("stop")) {
                System.out.println("You stopped guessing.");
                break;
            } else if (userGuess.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Congratulations!");
                break;
            } else {
                System.out.println("Guess my name (type 'stop' to exit)");
            }
        }

        System.out.println("You guessed " + numberOfGuesses + " times.");
    }
}
