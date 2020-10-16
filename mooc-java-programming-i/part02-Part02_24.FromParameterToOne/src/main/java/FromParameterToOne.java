
public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(7);
    }

    public static void printFromNumberToOne(int number) {
        while (number > 0) {
            sout(String.valueOf(number));
            number--;
        }
    }

    public static void sout(String text) {
        System.out.println(text);
    }
}
