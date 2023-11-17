import java.util.Scanner;

public class secondQuestion {
    public static void main(String[] args) {
        /*
        Create app that user can use to track if he/she is exercising enough.
        App will ask level of activity and then minutes for each day in week (7 days) from user.
         Use sequence structure/toistorakenne (loop) when asking the minutes.
         After getting minutes for each day app will print level of activity and minutes added up.
         Examples Activity level of exercise (vigorous/moderate)? moderate Minutes on 1. day?
         30 Minutes on 2. day? 15 Minutes on 3. day? 30 Minutes on 4. day? 45 Minutes on 5. day? 0 Minutes on 6. day? 0 Minutes on 7. day?
         35 You did 155 minutes moderate exercise during week. create in java
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Activity level of exercise (vigorous/moderate)?");
        String exerciseLevel = sc.nextLine();
        int totalMins = 0;


        for (int day = 0; day <7; day++){
            System.out.println("Please write the minutes for the day " + (day+1));
            int minutes = sc.nextInt();
            totalMins = totalMins + minutes;

        }

        System.out.println("You did "+ totalMins + " minutes exercise" + exerciseLevel +" during week");
    }

}
