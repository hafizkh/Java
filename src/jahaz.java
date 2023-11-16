public class jahaz {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.printDetails();

        Plane plane1 = new Plane("PIA",659);

        plane1.printDetails();

        Employee employee = new Employee("Hafiz",34555);
        employee.printData();


    }
}

class Plane{
    public String flag;
    public int speed;

    public Plane(){
        flag = "Qatar";
        speed = 650;
    }
    public Plane(String flag, int speed) {
        this.flag = flag;
        this.speed = speed;
    }
    public void printDetails(){
        System.out.println("The carrier is " + flag + " and speed is " + speed);
    }

}
