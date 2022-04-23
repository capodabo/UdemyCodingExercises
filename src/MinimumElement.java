import java.util.Scanner;

public class MinimumElement {

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of numbers you would like to add:");
        return scanner.nextInt();
    }

    public static int[] readElements(int count) {
        int[] intArray = new int[count];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Please enter number " + (i + 1) + ":");
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    public static int findMin(int[] array) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }
}
