import java.util.ArrayList;
import java.util.Scanner;

public class progTest1 {
    public static void main(String[] args) {
        /*
        Create an ArrayList. Ask the user to input items and assign them to the list.
            The output in the console should be:
            Add item (type q to quit)
            Laptop
            Add item (type q to quit)
            Mouse
            Add item (type q to quit)
            q
            Laptop
            Mouse
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<>();
        while (true) {
            System.out.println("Add item (type q to quit)");
            String items = sc.nextLine();

            myList.add(items);
            if(items.equalsIgnoreCase("q")){
                break;
            }

        }
    }
}
