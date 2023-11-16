import java.util.Scanner;

public class AssignmentTutor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Firt Name: ");
        String fName = input.nextLine();

        System.out.print("Last Nme: ");
        String lName = input.nextLine();

        System.out.print("Code: ");
        String code = input.nextLine();

        if (fName.isEmpty() || lName.isEmpty() || code.isEmpty()) {
            System.out.println("Problem.");
            return;
        }

        String email = generateEmail(fName, lName, code);
        System.out.println("Sähköpostiosoite: " + email);

        String username = generateUsername(fName, lName);
        System.out.println("Username: " + username);
    }

    public static String generateEmail(String fisrt_name, String last_name, String domain) {
        String email = fisrt_name + "." + last_name + "@" + domain;
        email = email.toLowerCase();
        return email;
    }

    public static String generateUsername(String first_name, String last_name) {
        String username = first_name.substring(0, Math.min(first_name.length(), 4)) +
                last_name.substring(Math.max(last_name.length() - 4, 0));
        username = username.toLowerCase();
        return username;
    }
}

