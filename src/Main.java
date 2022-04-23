import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {5, 4, 3, 2, 1};
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Reversed array = " + Arrays.toString(ReverseArray.reverse(array)));
    }
}
