import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int count = MinimumElement.readInteger();
        int[] array = MinimumElement.readElements(count);
        System.out.println("Your array is " + Arrays.toString(array));
        System.out.println("The minimum in your array is " + MinimumElement.findMin(array));
    }
}
