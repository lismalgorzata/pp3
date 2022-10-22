public class Lamp {
    boolean isOn;

    public void switchOn() {
        if (isOn) {
            System.out.println("Lamp already on");
        } else {
            isOn=true;
            System.out.println("Lamp on");
        }
    }
    public void switchOff() {
        if (!isOn) {
            System.out.println("Lamp already off");
        } else {
            isOn=false;
            System.out.println("Lamp off");
        }
    }

    public static void main(String[] args){
        Lamp lamp = new Lamp();

        lamp.switchOff();
        lamp.switchOn();
        lamp.switchOn();
        lamp.switchOff();
        lamp.switchOn();
    }
}
