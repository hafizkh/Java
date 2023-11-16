public class second {
    public static void main(String[] args) {

        int [] numArr = {16, 18, 5, 3, 10};
        int smallest = numArr[0];

        for (int number: numArr) {
            if (number<smallest){
                smallest=number;
            }
        }
        System.out.println(smallest);
    }
}