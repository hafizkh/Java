import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // Create a 1-dimensional array of furnitures
        String[] furnitures = {"Table", "Chair", "Shelf", "Sofa", "Bed"};

        // Print the whole array to the console
        System.out.println("The whole array is:");
        Arrays.stream(furnitures).forEach(System.out::println);

        // Print only the first two elements of the array
        System.out.println("The first two elements of the array are:");
        for (int i = 0; i < 2; i++) {
            System.out.println(furnitures[i]);
        }

        // Print only "Sofa" if it is found in the array
        System.out.println("Is 'Sofa' in the array?");
        boolean sofaFound = false;
        for (String furniture : furnitures) {
            if (furniture.equals("Sofa")) {
                sofaFound = true;
                break;
            }
        }

        if (sofaFound) {
            System.out.println("Yes, 'Sofa' is in the array!");
        } else {
            System.out.println("No, 'Sofa' is not in the array.");
        }
    }
}
