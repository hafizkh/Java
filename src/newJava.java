public class newJava {
    public static void main(String[] args) {
        Employee employee = new Employee("Neeru", 4500);
        employee.printData();
    }
}

class Employee{
    String name;
    int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public void printData(){
        System.out.println("The salary is " + salary + " and name is "  + name);
    }
}
