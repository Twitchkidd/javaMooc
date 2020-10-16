
public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number; i++) {
            sout(String.valueOf(i));
        }
    }

    public static void sout(String text) {
        System.out.println(text);
    }
}
