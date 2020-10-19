
public class MainProgram {

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(3);

        counter.printValue();
        counter.decrement();
        counter.decrement();
        counter.decrement();
        counter.decrement();
        counter.printValue();

        DecreasingCounter resetMe = new DecreasingCounter(100);

        resetMe.printValue();
        resetMe.reset();
        resetMe.printValue();

    }
}
