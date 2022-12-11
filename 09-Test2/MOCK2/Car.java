public class Car extends Vehicle {
    public int maxSpeed;

    public Car(int s, int maxSpeed) {
        super(s);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec() {
        int[] specs = new int[2];
        specs[0] = getSeats();
        specs[1] = maxSpeed;
        return specs;
    }

    public static void main(String[] args) {
        Car c = new Car(5, 250);
        c.spec();

    }

}
