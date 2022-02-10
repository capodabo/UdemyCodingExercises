public class NumberToWords {
    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.print("Invalid Value");
        }

        int numberToPrint = reverse(number);

        for (int i = 0; i < getDigitCount(number); i++) {

            switch (numberToPrint % 10) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            numberToPrint /= 10;
        }
        System.out.println();
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = (reversedNumber * 10) + (number % 10);
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int digitCount = 1;
        while (number >= 10) {
            digitCount++;
            number /= 10;
        }
        return digitCount;
    }
}
