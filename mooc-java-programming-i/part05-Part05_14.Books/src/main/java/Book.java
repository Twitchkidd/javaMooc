
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object compared) {
        if (compared == this) {
            return true;
        }
        if (!(compared instanceof Book)) {
            return false;
        }
        Book comparedBook = (Book) compared;
        return (comparedBook.getName().equals(this.name) && comparedBook.getPublicationYear() == this.publicationYear);
    }

}
