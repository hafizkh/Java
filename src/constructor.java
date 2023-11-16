public class constructor {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();
        monitor1.start();
        monitor1.shutdown();
        Monitor monitor2 = new Monitor();
        monitor2.shutdown();
        monitor2.start();

        if (monitor2.isOn){
            System.out.println("Monitor is On");
        }
        else {
            System.out.println("Monitor is off");
        }
    }
} // End of the main Method

class Monitor{
    public boolean isOn;

    public void start() {
        isOn = true;
    }

    public void shutdown() {
        isOn = false;
    }
}
