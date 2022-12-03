package DC7;

public class CompProc {
    public static void main(String[] args) {
        Computer computer = new Computer("Lenovo", 0, 0, 0);
        Processor processor = new Processor(0, 0, 0, computer, false);

        processor.fetch();
    }

}
