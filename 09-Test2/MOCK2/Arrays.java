import java.util.*;

public class Arrays {

    public static boolean arr(int[] arr1, int[] arr2){
       int sum1 = 0;
       int sum2 = 0;
        for (int number : arr1) {
            if (number > 10 && number < 100) {
                sum1++;
            }
        }
        for (int number : arr2) {
            if (number > 10 && number < 100) {
                sum2++;
            }
        }

        if (sum1==sum2) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        boolean n1 = arr(new int[]{15,8,2,37,49,117}, new int[] {9,6,7,12,48,4,6,90,5});
        System.out.println(n1);
    }

}
