public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double myDouble1, double myDouble2){
        return (int) (myDouble1 * 1000) == (int) (myDouble2 * 1000);
    }
}
