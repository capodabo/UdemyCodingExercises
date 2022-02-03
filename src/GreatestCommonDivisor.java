public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int a, int b) {
        if (a < 10 || b < 10) {
            return -1;
        }
        int c = Math.min(a, b);
        while (c > 0) {
            if (a % c == 0 && b % c == 0) {
                return c;
            } else {
                c--;
            }
        }
        return c;
    }
}
