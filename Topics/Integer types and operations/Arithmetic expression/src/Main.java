import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integerValue = scanner.nextInt();

        System.out.println(((integerValue + 1) * integerValue + 2) * integerValue + 3);
    }
}