public class Person {
    String name;
    int weight;
    double height;
    double bmi;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void setWeightAndHeight(int weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public void calculateBMI() {
        this.bmi=(weight/(height*height));
    }

    public void displayRecord() {
        if (18.5>this.bmi) {
            System.out.print("Name: "+ name + " | ");
            System.out.print("Weight: "+ weight + " | ");
            System.out.print("Height: "+ height + " | ");
            System.out.println("BMI is too low");
        } else if (this.bmi>24.5) {
            System.out.print("Name: "+ name + " | ");
            System.out.print("Weight: "+ weight + " | ");
            System.out.print("Height: "+ height + " | ");
            System.out.println("BMI is too high");
        } else {
            System.out.print("Name: "+ name + " | ");
            System.out.print("Weight: "+ weight + " | ");
            System.out.print("Height: "+ height + " | ");
            System.out.println("BMI: "+ this.bmi);
        }
    }
}
