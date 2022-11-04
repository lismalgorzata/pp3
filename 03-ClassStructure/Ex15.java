public class Ex15 {

    static int numberOfItems(int x, int y) {
        return (y-x)+1;
    }

    static int sumOfNumbers(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++)
            sum = sum + i;
        return sum;
    }

    static double arithmeticMean(int x, int y) {
        return (sumOfNumbers(x, y) / numberOfItems(x, y));
    }

    public static void main(String[] args){
        System.out.println(numberOfItems(5, 10));
        System.out.println(sumOfNumbers(5, 10));
        System.out.println(arithmeticMean(5, 10));
    }
}

