package DC7;

public class Computer {
    String model;
    int speed;
    int memory;
    double accuracy;
    boolean isOn;

    public Computer(String model, int speed, int memory, double accuracy) {
        this.model = model;
        this.speed = speed;
        this.memory = memory;
        this.accuracy = accuracy;
    }

    public String getModel() {
        return model;
    }

    public void doAction() {

    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }


}
