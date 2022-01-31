public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number >= 0) {
            int lastDigit = number % 10;
            while (number >= 10) {
                number /= 10;
            }
            return lastDigit + number;
        }
        else {
            return -1;
        }
    }
}
