public class codeRunner3_1 {
    public static void main(String[] args) {
        /*
            Create an interface called Interactable. It has method interact.
            1- Implement two classes of Interactable interface: Door and LightSwitch  (implement is quite the same as inherit)
            2- The interact method of the Door class prints to the console: Door opened
            3- The interact method of the LightSwitch class prints to the console: Lights turned on
            4- Create objects of each class and call the interact method.
         */

        Door door = new Door();
        door.interact();

        LightSwitch1 lightSwitch1 = new LightSwitch1();
        lightSwitch1.interact();

    }
}

interface Interactable{
    void interact();
}

class Door implements Interactable{
    @Override
    public void interact() {
        System.out.println("Door opened");
    }
}

class LightSwitch1 implements Interactable{
    @Override
    public void interact() {
        System.out.println("Lights turned on");
    }
}
