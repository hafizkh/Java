import java.util.ArrayList;
import java.util.Scanner;

public class progTest3 {
    public static void main(String[] args) {
        /*
        Copy your codes from the step 2.
            After the shopping cart and total of the items are printed (step 2), ask the user, what item should be removed/deleted from the list. If the user types 2, the second item is removed/deleted from the list. Lastly, print the shopping cart and the total again. Notice, that you don't have to check, if the user types 4 when there are just 2 items in the list (no need for error handling).
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
            Type the number of item you want to delete from the list
            2
            Item 1: Laptop
            Items total: 1

         */

        Scanner sc = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<>();
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

        // Removing the certain object with respect to the index number
        System.out.println("Type the number of item you want to delete from the list");
        int removedObj = sc.nextInt();

        myList.remove(removedObj - 1);

        // Getting the new list after removal of certain object
        for (int j=0;j<myList.size(); j++){
            System.out.println("Item " + (j+1) + ": " + myList.get(j) );
        }

        // Final Total Items in the list
        System.out.println("Items Total: " + myList.size());

    }
}
