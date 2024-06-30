import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integerNumber = scanner.nextInt();

        int digitNumber = integerNumber % 100;
        System.out.println(digitNumber / 10);
    }
}