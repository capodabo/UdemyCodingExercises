import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int arraySize) {
        int[] intArray = new int[arraySize];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter " + arraySize + " integers.");
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Please enter the integer number " + (i + 1) + ":");
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element " + i + " contents " + intArray[i]);
        }
    }

    public static int[] sortIntegers(int[] intArray) {
        int[] sortedArray = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            sortedArray[i] = intArray[i];
        }
        int temp;
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] < sortedArray[j]) {
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[i];
                    sortedArray[i] = temp;
                }
            }
        }
        return sortedArray;
    }
}
