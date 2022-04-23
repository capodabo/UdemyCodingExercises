import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myIntegers = SortedArray.getIntegers(5);
        int[] sortedArray = SortedArray.sortIntegers(myIntegers);
        SortedArray.printArray(sortedArray);
        int[] array = new int[]{3, 4, 2, 5, 1};

        System.out.println("array = " + Arrays.toString(array));
        System.out.println("array sorted = " + Arrays.toString(SortedArray.sortIntegers(array)));
    }
}
