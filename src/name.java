import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("How old are you?");
        int age = sc.nextInt();

        System.out.println("Your name is " + name + " and you are " + age +" years old.");
    }

}
