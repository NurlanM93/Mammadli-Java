import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        
        if (number > 7) {
            System.out.println("HELLO");
        } else {
            System.out.println("Number is not greater than 7");
        }
    }
}