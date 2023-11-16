import java.util.Scanner;

public class feverReview {
    public static void main(String[] args) {
        printFeverLimits();

        System.out.println("Subject");
        Scanner sc = new Scanner(System.in);
        String subject = sc.nextLine();
        System.out.println("Temperature");
        int temperature = sc.nextInt();


        if(hasFever(subject,temperature) == true){
            System.out.println("Subject has Fever");
        }
        else {
            System.out.println("Subject does not has fever");
        }

    } // End of the main method

    public static void printFeverLimits(){

        System.out.println("- human 37\n- dog 39\n- horse 38");
    }

     public static boolean hasFever(String subject, int temperature){
        boolean hasFever = false;

        if(subject.equals("horse") && temperature > 38){
            hasFever = true;
        }
        else if(subject.equals("dog") && temperature>39) {
            hasFever = true;
        }
        else if(subject.equals("human") && temperature>37){
            hasFever = true;
        }
        return hasFever;
     }
}
