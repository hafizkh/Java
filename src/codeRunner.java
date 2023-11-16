public class codeRunner {
    public static void main(String[] args) {
//        printHelloHamk();
        sumTheValues(53,5);
        printTitle();
        printGreater(2,5);
        System.out.println(sumValues(5,6));
        System.out.println(printGreetings());
        printTitle(true);
    }

    public static void printHelloHamk(){
        System.out.println("Hello HAMK");
    }

    public static void sumTheValues(int number1, int number2){
        int sum = number1+number2;
        System.out.println("The sum is "+sum + ".");
        printNumbers();
        printIt("Hello");
    }

    public static String printGreetings () {
        String greetings = "Hello!";
        return greetings;
    }

    public static void printTitle(){
        System.out.println("****************");
        System.out.println("*The Best App*");
        System.out.println("****************");
    }

    public static void printNumbers(){
        for (int i =10;i<=40;i++){
            System.out.println(i);
        }
    }

    public static void printIt(String text){
        System.out.println(text);
    }

    public static void printGreater(int num1, int num2){
        if(num1>num2){
            System.out.println(num1);
        }
        else if (num2>num1){
            System.out.println(num2);
        }
        else {
            System.out.println("The numbers are equal.");
        }
    }

    public static int sumValues(int number1, int number2){
        int sum = number1+number2;
        return sum;
    }

    public static void printTitle(boolean printStars) {
        String title = "The Title";
        int titleLength = title.length();

        // Print the title
        System.out.println(title);

        if (printStars) {
            // Print stars underneath
            for (int i = 0; i < titleLength; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
