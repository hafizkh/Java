public class codeRunner3_2 {
    public static void main(String[] args) {
        /*
            Because interfaces can’t have attributes, in some cases an abstract class could be a better option.

            Create an abstract class called Interactable. It has one abstract method called interact.
            The abstract class has also one public attribute called isOn. Type is boolean.
            Inherit two classes of Interactable class: Door and LightSwitch
            The default value of isOn attribute is false. You can set this in the constructor method but not necessary. If the interactable object is interacted, like the door is opened or light is turned on, the value of the isOn attribute is true.
            When calling interact method of the Door class, the method checks what is the value of the isOn attribute. If it is false, the method prints “Door opened” and sets the isOn value to true. And if the value is true, method prints “Door closed” and sets the value of isOn to false.
            Same idea with the LightSwitch class, but the phrases to be printed are: "Lights turned on" and "Lights turned off".
            Create objects of classes Door and LightSwitch and call the interact method twice.

            If we create an object of Door class and call the interact method twice and lastly print the value of the isOn attribute, we get:

            Door opened
            Door closed
            false
         */
        Door1 door = new Door1();
        door.interact();
        door.interact();
        System.out.println(door.isOn);

        System.out.println("----------------------------");
        LightSwitch2 lightSwitch2 = new LightSwitch2();
        lightSwitch2.interact();
        lightSwitch2.interact();
        System.out.println(lightSwitch2.isOn);
    }
}

abstract class Interactable1{
    public abstract void interact();
    boolean isOn = false;
}

class Door1 extends Interactable1{
    @Override
    public void interact() {
        if(!isOn){
            System.out.println("Door opened");
            isOn = true;
        }
        else {
            System.out.println("Door closed");
            isOn = false;
        }
    }
}

class LightSwitch2 extends Interactable1{
    @Override
    public void interact() {
        if (!isOn) {
            System.out.println("Lights turned on");
            isOn = true;
        }
        else {
            System.out.println("Lights turned off");
            isOn = false;
        }
    }
}