import java.util.Scanner;

public class whileAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number");
        int userInp = sc.nextInt();
        int i = 1;
        while (i<=10){
            System.out.println(userInp + " X "+ i +" = " + userInp*i);
            i++;
        }

    }
}
