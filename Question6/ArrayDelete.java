package Question6;
import java.util.Arrays;

public class ArrayDelete {

    public static int[] deleteElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Incorrect Index.");
            return array;
        }
        int n=array.length;
        int[] newArray1 = new int[n - 1];
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newArray1[newIndex] = array[i];
                newIndex++;
            }
        }

        return newArray1;
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        int indexToDelete = 2; // Index of element to delete

        System.out.println("The original array inserted: " + Arrays.toString(array));

        array = deleteElement(array, indexToDelete);

        System.out.println("Array after after deleting from the index you provided " + indexToDelete + ": " + Arrays.toString(array));
    }
}
