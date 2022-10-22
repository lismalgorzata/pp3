import java.util.Scanner;

public class Counter {
    private int currentValue;
    int value;

        public void addOne() {
            currentValue +=1;
            System.out.println(currentValue);
        }

        public void subtractOne() {
            currentValue -=1;
            System.out.println(currentValue);
        }

        public void addTen() {
            currentValue =  currentValue+10;
            System.out.println(currentValue);
        }

        public void substractTen() {
            currentValue =  currentValue-10;
            System.out.println(currentValue);
        }

        public void resetToInitialValue() {
            currentValue=value;
            System.out.println(currentValue);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert initial value: ");
            int initialValue = scanner.nextInt();

            Counter counter = new Counter();
            counter.value = initialValue;

            counter.addTen();
            counter.addTen();
            counter.addOne();
            counter.addOne();
            counter.addOne();
            counter.resetToInitialValue();

            counter.substractTen();
            counter.substractTen();
            counter.substractTen();
            counter.substractTen();
            counter.substractTen();
            counter.addOne();
            counter.addOne();
            counter.addOne();
        }
    }
