import java.util.Scanner; // essential import for user input

public class Main {
    public static void main(String[] args) {
        // Create a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int inputSquare = input * input;
        System.out.println(inputSquare);
        // Important to close the scanner!
        scanner.close();
    }
}