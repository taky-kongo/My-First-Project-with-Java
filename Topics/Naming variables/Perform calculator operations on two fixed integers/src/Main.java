import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare two int variables for the calculation
        final int firstNumber = 5;
        final int secondNumber = 3;

        // Use Scanner to read the operator input
        Scanner scanner = new Scanner(System.in);
        char operator = scanner.nextLine().charAt(0);

        // Perform the operation based on the operator and print the result
        switch (operator) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                // Integer division
                System.out.println(firstNumber / secondNumber);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
