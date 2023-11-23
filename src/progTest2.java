import java.util.ArrayList;
import java.util.Scanner;

public class progTest2 {
    public static void main(String[] args) {
        /*
        Copy your codes from the step 1.
            Add numbers to questions (colored red) and to the printing of the whole list (colored blue). Also add "Shopping Cart" before you print the whole list (colored green). Notice, that you don't have to add any coloring to output. Colors are here just for you to help to understand the assignment.
            Add the amount of items to the end of the code.
            The output in the console should be:
            Add item 1 (type q to quit)
            Laptop
            Add item 2 (type q to quit)
            Mouse
            Add item 3 (type q to quit)
            q
            Shopping Cart
            Item 1: Laptop
            Item 2: Mouse
            Items total: 2
         */

        Scanner sc = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<String>();
        while (true) {
            System.out.println("Add item "+ (myList.size()+1) +" (type q to quit)");
            String items = sc.nextLine();

            myList.add(items);
            if(items.equalsIgnoreCase("q")) {
                break;
            }
        }
        // Removing the last item as that is "q", that we do not need to count in the array list
            myList.remove(myList.size()-1);

            System.out.println("Shopping Cart");
            for (int i = 0; i<myList.size(); i++){
                System.out.println("Item " + (i+1) + ": " + myList.get(i));
            }

            // Total Items in the cart

            System.out.println("Items Total: " + myList.size());

    }
}
