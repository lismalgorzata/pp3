public abstract class Vehicle {
    private int maxSpeed;
    private String brand;
    private String model;
    private boolean isEngineOn;

    public Vehicle(int maxSpeed, String brand, String model) {
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.model = model;
        this.isEngineOn = false;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
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

    public boolean getIsEngineOn() {
        return isEngineOn;
    }

    public void setIsEngineOn(boolean isEngineOn) {
        this.isEngineOn = isEngineOn;
    }

    abstract void drive();

    public static void main(String[] args) {
        Car c = new Car(300, "Toyota", "Yaris");
        Truck t = new Truck(250, "Scania", "P230 Zepro");
        Bus b = new Bus(280, "Mercedes", "Sprinter");

        c.setIsEngineOn(true);
        b.setIsEngineOn(true);
        t.setIsEngineOn(true);

        c.drive();
        b.drive();
        t.drive();
    }

}
