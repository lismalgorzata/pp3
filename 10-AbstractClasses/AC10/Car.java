public class Car extends Vehicle {
    public Car(int maxSpeed, String brand, String model) {
        super(maxSpeed, brand, model);
    }

    public void drive() {
        if (getIsEngineOn()) {
            System.out.println("Car on");
        }
        else {
            System.out.println("Car off.");
        }
    }
}
