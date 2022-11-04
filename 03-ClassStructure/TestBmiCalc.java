public class TestBmiCalc {
    public static void main(String[] args) {
        Person p1 = new Person("Małgosia");
        Person p2 = new Person("Sylwia", 61, 1.75);
        Person p3 = new Person("Bartek");

        p1.setWeightAndHeight(53, 1.69);
        p1.calculateBMI();
        p1.displayRecord();

        p2.calculateBMI();
        p2.displayRecord();

        p3.setWeightAndHeight(96, 1.80);
        p3.calculateBMI();
        p3.displayRecord();
    }
}
