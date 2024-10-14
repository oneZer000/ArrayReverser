import java.util.Arrays;

public class ArrayReverserCLI {
    public static void main(String[] args) {
        int[] origArr = {1, 2, 3, 4, 5};
        int[] reverseArr = ArrayReverser.reverse(origArr);

        String origArrStr = Arrays.toString(origArr);
        String reverseArrStr = Arrays.toString(reverseArr);

        System.out.printf("Исходный массив: %s\n", origArrStr);
        System.out.printf("Реверсированный массив: %s\n", reverseArrStr);
    }
}