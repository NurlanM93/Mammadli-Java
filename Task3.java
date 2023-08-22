import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter a name: ");
        String enteredName = scanner.nextLine();
    
        if (enteredName.equals("Vyacheslav")) {
            System.out.println("Hello, Vyacheslav");
        } else {
            System.out.println("No such name");
        }
        
        scanner.close();
    }
}