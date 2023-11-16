import java.util.Scanner;

public class bopTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Activity level of exercise (vigorous/moderate)?");
        String activityLevel = scanner.nextLine();

        int totalMinutes = 0;
        for (int day = 1; day <= 7; day++) {
            System.out.println("Minutes on " + day + ". day?");
            int minutes = scanner.nextInt();
            totalMinutes += minutes;
        }

        System.out.println("How many times you did muscle strengthening and balance activities?");
        int muscleStrengtheningCount = scanner.nextInt();

        scanner.close();

        System.out.println("You did " + totalMinutes + " minutes " + activityLevel + " exercise during the week.");

        if (checkActivityRecommendation(activityLevel, totalMinutes, muscleStrengtheningCount)) {
            System.out.println("You exercise enough according to the recommendations!");
        } else {
            System.out.println("You should exercise more!");
        }
    }

    public static boolean checkActivityRecommendation(String activityLevel, int totalMinutes, int muscleStrengtheningCount) {
        if ((activityLevel.equalsIgnoreCase("vigorous") && totalMinutes >= 75) || (activityLevel.equalsIgnoreCase("moderate") && totalMinutes >= 150)) {
            return muscleStrengtheningCount >= 2;
        }
        return false;
    }
}

