public class TeenNumberChecker {
    public static boolean hasTeen (int firstInt, int secondInt, int thirdInt) {
        return isTeen(firstInt) || isTeen(secondInt) || isTeen(thirdInt);
    }
    public static boolean isTeen (int forthInt) {
        return forthInt >= 13 && forthInt <= 19;
    }
}
