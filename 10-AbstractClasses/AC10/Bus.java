public class Bus extends Vehicle{
    public Bus(int maxSpeed, String brand, String model) {
        super(maxSpeed, brand, model);
    }

    public void drive() {
        if (getIsEngineOn()) {
            System.out.println("Bus on");
        } else {
            System.out.println("Bus off");
        }
    }
}
