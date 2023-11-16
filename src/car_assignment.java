import java.util.Scanner;

public class car_assignment {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "RAV4", 40);
        Scanner sc = new Scanner(System.in);

        System.out.println("Object created with values:");
        car.printData();

        System.out.println("a=accelerate b=break x=exit");

        while (true) {
            String input = sc.nextLine();

            if (input.equals("a")) {
                car.accelerate();
            } else if (input.equals("b")) {
                car.brake();
            } else if (input.equals("x")) {
                break;
            }

            car.printData();
            System.out.println("a=accelerate b=break x=exit");
        }
        sc.close();
    }
}


class Car{
    public String brand;
    public int amountOfFuel;
    public String model;

    public Car(){
        this.brand = "";
        this.model = "";
        this.amountOfFuel = 0;
    }
    public Car(String brand, String model, int amountOfFuel){
        this.brand = brand;
        this.model = model;
        this.amountOfFuel = amountOfFuel;
        System.out.println("Brand: " + brand + "\nModel: " + model+ "\nFuel: " + amountOfFuel);
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void brake() {
        System.out.println("Car is breaking");
    }

    public void accelerate() {
        if (amountOfFuel >0){
            System.out.println("Car is accelerating");
            amountOfFuel --;
        }
    }
    public void printData(){
        System.out.println("Brand: " + brand + "\nModel: " + model+ "\nFuel: " + amountOfFuel);
    }
    public void refuel(int amount){
        int previousFuel = amountOfFuel;
        amountOfFuel = amount + amountOfFuel;
        System.out.println("Fuel in the tank: " + previousFuel + "\nRefuel: " +amount + "\nFuel in the tank after the refuel: " + amountOfFuel);
    }
}
