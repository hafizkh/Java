public class bopAgain {
    public static void main(String[] args) {
        checkActivityRecommendation("moderate", 100);


    }
    public static String checkActivityRecommendation(String activityLevel, int amount){
        if(amount >= 75 && activityLevel.equals("vigorous") || amount>=150 && activityLevel.equals("moderate")){
            System.out.println("You exercise enough according to the recommendations!");
        }
        else {
            System.out.println("You should exercise more!");
        }
        return activityLevel;
    }
}
