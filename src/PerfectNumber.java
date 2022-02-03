public class PerfectNumber {
    public static boolean isPerfectNumber (int number) {
        if (number < 1) {
            return false;
        }
        int divisor = 1;
        int divisorSum = 0;
        while (divisor < number) {
            if (number % divisor == 0) {
                divisorSum += divisor;
            }
            divisor++;
        }
        return divisorSum == number;
    }
}
