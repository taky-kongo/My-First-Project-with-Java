import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int minutes = 60;
        final int seconds = 60;

        int firstHour = scanner.nextInt();
        int firstMinutes = scanner.nextInt();
        int firstSeconds = scanner.nextInt();
        int secondHour = scanner.nextInt();
        int secondMinutes = scanner.nextInt();
        int secondSeconds = scanner.nextInt();

        int resultHoursInSecond = (secondHour - firstHour) * minutes * seconds;
        int resultMinutesInSecond = (secondMinutes - firstMinutes) * seconds;
        int resultSeconds = secondSeconds - firstSeconds;

        System.out.println(resultHoursInSecond + resultMinutesInSecond + resultSeconds);
    }
}
