import java.util.*;

public class Numbers {
    int a;
    int b;
    int c;
    int d;
    int e;
    public Numbers(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public boolean different(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(this.a);
        numbers.add(this.b);
        numbers.add(this.c);
        numbers.add(this.d);
        numbers.add(this.e);

        Set<Integer> setNumbers = new HashSet<>(numbers);
        if (numbers.size() == setNumbers.size()) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Numbers n1 = new Numbers(3, 4, 2, 1, 6);

        System.out.println(n1.different());
    }

}