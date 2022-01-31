public class EvenDigitSum {
    public static int getEvenDigitSum (int number) {

        int evenSum = 0;
        if (number < 0) {
            return -1;
        }
        else {
            while (number > 0) {
                int digit = number % 10;
                if (digit % 2 == 0) {
                    evenSum += digit;
                }
                number /= 10;
            }
            return evenSum;
        }
    }
}
