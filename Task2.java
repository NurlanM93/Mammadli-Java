import java.util.Scanner;

 public class Main
 {
    public static void main(String[] args) {
        int[] array = { 2, 6, 9, 12, 15, 18, 21, 25 };

        System.out.println("Multiples of 3 in the array:");
        for (int num : array) {
            if (num % 3 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}