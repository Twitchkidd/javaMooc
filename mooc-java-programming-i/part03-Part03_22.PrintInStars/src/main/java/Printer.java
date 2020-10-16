public class Printer {
    public static void main(String[] args) {
        int[] array = { 5, 1, 3, 4, 2 };
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int index = 0;
        while (index < array.length) {
            for (int i = 1; i <= array[index]; i++) {
                if (i == array[index]) {
                    System.out.print("*\n");
                } else {
                    System.out.print("*");
                }
            }
            index++;
        }
    }

}
