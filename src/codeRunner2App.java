import java.util.Scanner;

public class codeRunner2App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Width?");
        int userWidth = sc.nextInt();
        System.out.println("Length?");
        int userLength = sc.nextInt();

        System.out.println("Area is " + Utils.areaCalc(userWidth, userLength));

    }
}

class Utils{

    public static void printTitle(){
        System.out.println("*******");
        System.out.println("* OOP *");
        System.out.println("*******");
    }

    public static int areaCalc(int width, int length){
        return width * length;

    }
}