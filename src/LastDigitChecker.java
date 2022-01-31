public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c)) {
            return ((a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10));
        }
        else {
            return false;
        }
    }
    public static boolean isValid(int d) {
        return (d >= 10 && d <= 1000);
    }
}
