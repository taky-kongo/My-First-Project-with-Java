import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int thirdNumber = number / 100;
        int secondNumber = ((number % 100) / 10) * 10;
        int firstNumber = ((number % 100) % 10) * 100;

        int newNumber = (thirdNumber + secondNumber + firstNumber);
        System.out.println(newNumber);
    }
}