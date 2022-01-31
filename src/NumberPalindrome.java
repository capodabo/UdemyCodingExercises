public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int i = number;

        while (i != 0) {
            int lastDigit = i % 10;
            reverse = (reverse * 10) + lastDigit;
            i /= 10;
        }
        return (number == reverse);
    }
}
