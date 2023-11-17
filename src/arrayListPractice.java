import java.util.ArrayList;
import java.util.Scanner;

public class arrayListPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> myList = new ArrayList<String>();
        while (true){
            System.out.println("Please add items in Bucket, type stop to exit");
            String item = sc.nextLine();

            myList.add(item);
            if (item.equals("x")){
                break;
            }
        }
        myList.remove(myList.size()-1);

        System.out.println(myList);

        for (int i = 0; i<myList.size();i++){
            System.out.println("Item " + (i+1) +": " + myList.get(i));
        }
        System.out.println("Items in the Basket are: " + myList.size());

        System.out.println("Write the index to remove item");
        int removalIndex = sc.nextInt();

        myList.remove(removalIndex-1);

        for(int j = 0;j<myList.size();j++){
            System.out.println("Final Items in teh basket at the index "+ (j+1) + ": " + myList.get(j));
        }
        System.out.println("Total Items in the Basket are: " + myList.size());

    }
}
