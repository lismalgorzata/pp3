public class Person {
    String name;
    int weight;
    int height;
    double bmi;

    public Person(String n) {
        name = n;
    }

    public Person(String n, int w, int h) {
        name = n;
        weight = w;
        height = h;
    }

    public void setWeightAndHeight(int w, int h) {
        weight = w;
        height = h;
    }

    public void calculateBMI() {
        double bmi=(weight/height*height);
    }

    public void displayRecord() {
        if (18.5<bmi) {
            System.out.print("Name: "+ name + " | ");
            System.out.print("Weight: "+ weight + " | ");
            System.out.print("Height: "+ height + " | ");
            System.out.println("BMI is too low");
        } else if (bmi>24.5) {
            System.out.print("Name: "+ name + " | ");
            System.out.print("Weight: "+ weight + " | ");
            System.out.print("Height: "+ height + " | ");
            System.out.println("BMI is too high");
        } else {
            System.out.print("Name: "+ name + " | ");
            System.out.print("Weight: "+ weight + " | ");
            System.out.print("Height: "+ height + " | ");
            System.out.println("BMI: "+ bmi);
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Małgosia", 56, 169);
        Person p2 = new Person("Sylwia", 61, 175);
        Person p3 = new Person("Bartek", 100, 180);

        p1.setWeightAndHeight(53, 169);
        p1.calculateBMI();
        p1.displayRecord();

        p2.calculateBMI();
        p2.displayRecord();

        p3.setWeightAndHeight(96, 180);
        p3.calculateBMI();
        p3.displayRecord();
    }
}
