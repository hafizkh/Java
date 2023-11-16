import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random rand = new Random();

        int random = rand.nextInt(10) + 11;
        System.out.println("The random number is " + random);
    }
}
