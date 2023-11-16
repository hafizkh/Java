import javax.swing.*;

public class inheAssignment {
    public static void main(String[] args) {

        Toy toy = new Toy();
        toy.printDetails();

        CarToy carToy = new CarToy("Audi", 2500, "Blue");
        carToy.printDetails();
        carToy.turnOn();
    }
}

class Toy{
    protected String name;
    protected int weight;

    public Toy(){
        this.name = "My default Toy";
        this.weight = 1;
    }

    public Toy(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public void printDetails(){
        System.out.println("The name of the Toy is " + name);
        System.out.println("The weight of the Toy is " + weight);
    }
}

class CarToy extends Toy{
    private String color;

    public CarToy(){
        super();
        this.color = "Red";
    }

    public CarToy(String name, int weight, String color){
        super(name,weight);
        this.color = color;
    }

    public void turnOn(){
        System.out.println("The " + name + " is turned on");
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Color " +color);
    }
}