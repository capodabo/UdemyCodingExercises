public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigPack = bigCount * 5;

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        if (bigPack > goal) {
            return ((bigPack - 5) + smallCount) >= goal;
        } else {
            return (bigPack + smallCount) >= goal;
        }
    }
}
