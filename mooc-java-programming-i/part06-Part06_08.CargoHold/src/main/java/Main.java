
public class Main {

    public static void main(String[] args) {
        Suitcase m = new Suitcase(10);
        Hold r = new Hold(100);
        r.addSuitcase(m);
    }

}
