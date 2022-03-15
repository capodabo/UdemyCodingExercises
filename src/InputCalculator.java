import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg = 0;

        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            count++;
            avg = (double) sum / count;
        }
        scanner.close();
        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
    }
}