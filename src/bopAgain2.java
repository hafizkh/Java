import java.util.Scanner;

public class bopAgain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Activity level of exercise (vigorous/moderate)?");

        String activityLevel = sc.nextLine();
        int totalMins = 0;

        for (int i = 1;i<=7;i++){
            System.out.println("Minutes on " + (i+1) +". day?");
            int minutes = sc.nextInt();
            totalMins = minutes + totalMins;
        }
        System.out.println("You did "+ totalMins+" minutes " + activityLevel+" exercise during week.");
    }

}
