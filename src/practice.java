import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number?");
        int n1= sc.nextInt();

        System.out.println("Second number?");
        int n2 = sc.nextInt();

        int sum = n1+n2;

        System.out.println(n1+ "+" + n2 +"="+ sum);
        sc.close();

    }

}
