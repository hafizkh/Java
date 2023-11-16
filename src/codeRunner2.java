public class codeRunner2 {
    public static void main(String[] args) {
        LightSwitch lightSwitch = new LightSwitch();
        lightSwitch.printInfo();

        Utils.printTitle();
        System.out.println("Area is " +  Utils.areaCalc(2,3));
    }
}

class LightSwitch{
    public boolean lightsOn = false;

    public void printInfo(){
        if(lightsOn){
            System.out.println("Lights are on");
        }
        else {
            System.out.println("Lights are off");
        }
    }
}

class Dimmer extends LightSwitch{
    public int brightness;

    public void setBrightness(int brightness){
        this.brightness = brightness;
        if(brightness == 0){
            lightsOn = false;
        }
        else {
            lightsOn=true;
        }
    }

    @Override
    public void printInfo() {
        if (brightness==0){
            System.out.println("Lights are off.");
        }
        else {
            System.out.println("Brightness is " + brightness + ".");
        }
    }
}

class Utils1{

    public static void printTitle(){
        System.out.println("*******");
        System.out.println("* OOP *");
        System.out.println("*******");
    }

    public static int areaCalc(int width, int length){
        return width * length;

    }
}