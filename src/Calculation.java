import java.util.Scanner;

public class Calculation {
    public static double calcArea(double width, double length){
        return width * length;
    }
    public static double calcArea(double radius){
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
//        double AreaOfRect = calcArea(2,3);
//        System.out.println("Area of Rectangle is: " + AreaOfRect);
//
//        double AreaOfCircle = calcArea(5);
//        System.out.println("Area of Circle is: " + AreaOfCircle);

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the area of a rectangle or a circle (r/c)");
        String userInput = sc.nextLine();

        if(userInput.equals("r")){
            System.out.println("please enter width?");
            double width = sc.nextInt();
            System.out.println("please enter length?");
            double length = sc.nextInt();
            System.out.println("Area of a rectangle is: "+ calcArea(width, length));
        } else if (userInput.equals("c")) {
            System.out.println("Please enter the value of radius");
            double rad = sc.nextInt();
            System.out.println("Area of Circle is: " + calcArea(rad));
        }
        else {
            System.out.println("Error");
        }
    }
}
