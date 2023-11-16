import java.util.Random;

public class secondArray {

    public static void main(String[] args) {
        // 1. Create a 1-dimensional array with 5 elements
        int[] thrownDiceNumbers = new int[5];

        // 2. Pick randomly 5 numbers and assign them to the array.
        Random random = new Random();
        for (int i = 0; i < thrownDiceNumbers.length; i++) {
            thrownDiceNumbers[i] = random.nextInt(6) + 1; // Generating random numbers between 1 and 6 (inclusive)
        }

        // 3. Print the whole array to the Console.
        System.out.println("Thrown Dice Numbers:");
        for (int number : thrownDiceNumbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // Print a newline for formatting

        // 4. Count the sum of the array values and print the result to the Console.
        int sum = 0;
        for (int number : thrownDiceNumbers) {
            sum += number;
        }
        System.out.println("Sum of the array values: " + sum);

        // 5. Print the highest value to the Console.
        int max = thrownDiceNumbers[0]; // Initialize max with the first element
        for (int i = 1; i < thrownDiceNumbers.length; i++) {
            if (thrownDiceNumbers[i] > max) {
                max = thrownDiceNumbers[i];
            }
        }
        System.out.println("Highest value: " + max);
    }
}
