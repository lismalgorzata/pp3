public class SuperCounter extends Counter {
    public Counter counter;

    public SuperCounter(int counter) {
        super(counter);
    }

    public void addN(int n) {
        int i=0;
        while(i<n) {
            add1();
            i++;
        }
    }

    public static void main(String[] args) {
        SuperCounter sc = new SuperCounter(19);
        sc.addN(1);
        System.out.println(sc.getCounter());
    }
}
