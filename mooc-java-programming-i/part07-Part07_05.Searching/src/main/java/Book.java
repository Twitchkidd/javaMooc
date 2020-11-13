
public class Book implements Comparable<Book> {

    private int id;
    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "(id: " + id + "; name: " + name + ")";
    }

    @Override
    public int compareTo(Book book) {
        return this.id - book.getId();
    }

    @Override
    public boolean equals(Object compared) {
        if (compared == this) {
            return true;
        }
        if (!(compared instanceof Book)) {
            return false;
        }
        Book comparedItem = (Book) compared;
        return (comparedItem.getId() == this.id);
    }

}
