import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int remainderOfDivision = input % 2;
        int multiplyTheRemainder = remainderOfDivision * 3;

        System.out.println(remainderOfDivision);
        System.out.println(multiplyTheRemainder);

        scanner.close();
    }
}