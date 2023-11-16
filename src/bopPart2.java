import java.util.Scanner;

public class bopPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Activity level of exercise (vigorous/moderate)?\n");
        String activityLevel = sc.nextLine();

        int totalMinutes = 0;
        for (int day = 1; day <= 7; day++) {
            System.out.println("Minutes on " + day + ".day? ");
            int minutes = sc.nextInt();
            totalMinutes += minutes;
        }
        System.out.println("You did " + totalMinutes + " minutes " + activityLevel + " exercise during week.\n");
    }
}