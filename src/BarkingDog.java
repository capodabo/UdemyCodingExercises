public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == true && hourOfDay >= 0 && hourOfDay < 8) {
            return true;
        } else if (barking == true && (hourOfDay == 22 || hourOfDay == 23)){
            return true;
        } else {
            return false;
        }
    }
}
