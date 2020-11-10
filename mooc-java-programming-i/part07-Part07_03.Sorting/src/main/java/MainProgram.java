
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = { 3, 1, 5, 99, 3, 12 };
        System.out.println(indexOfSmallest(array));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int indexOfSmallest = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex];
        int indexOfSmallest = startIndex;
        for (int i = startIndex; i <= array.length - 1; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int firstVal = array[index1];
        array[index1] = array[index2];
        array[index2] = firstVal;
    }

    public static void sort(int[] array) {

    }
}
