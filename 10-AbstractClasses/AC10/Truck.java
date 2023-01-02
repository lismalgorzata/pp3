public class Truck extends Vehicle {
    public Truck(int maxSpeed, String brand, String model) {
        super(maxSpeed, brand, model);
    }

    public void drive() {
        if (getIsEngineOn()) {
            System.out.println("Truck on");
        } else {
            System.out.println("Truck off");
        }

    }
}
