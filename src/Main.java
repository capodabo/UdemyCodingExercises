public class Main {
    public static void main(String[] args) {
        long speedToCalculate = (long) 130.5;
        System.out.println(speedToCalculate + " kilometers per hour = " + SpeedConverter.toMilesPerHour(speedToCalculate) + " miles per hour");
        SpeedConverter.printConversion(speedToCalculate);
    }
}