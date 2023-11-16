public class bopPart1 {
    public static void main(String[] args) {
        checkActivityRecommendation("moderate",160);
        checkActivityRecommendation("vigorous",60);
    }

    public static boolean checkActivityRecommendation(String activityLevel, int amount){
        if(activityLevel.equals("vigorous") && amount >=75 || activityLevel.equals("moderate") && amount >= 150){
            System.out.println("You exercise enough according to the recommendations!");
        }
        else {
            System.out.println("You should exercise more!");
        }
        return false;
    }
}
