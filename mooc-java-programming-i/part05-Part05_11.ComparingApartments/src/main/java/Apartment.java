
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int getSquares() {
        return this.squares;
    }

    public int getPrice() {
        return this.squares * this.princePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.getSquares() > compared.getSquares()) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        return Math.abs(this.getPrice() - compared.getPrice());
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.getPrice() > compared.getPrice()) {
            return true;
        } else {
            return false;
        }
    }

}
