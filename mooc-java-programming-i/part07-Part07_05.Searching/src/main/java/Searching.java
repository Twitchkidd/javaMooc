
// import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(24875, "Jole Smokes"));

        // System.out.println("How many books to create?");
        // int numberOfBooks = Integer.valueOf(scanner.nextLine());
        // for (int i = 0; i < numberOfBooks; i++) {
        // books.add(new Book(i, "name for the book " + i));
        // }

        // System.out.println("Id of the book to search for?");
        // int idToSearchFor = Integer.valueOf(scanner.nextLine());
        int idToSearchFor = 24875;

        // System.out.println("");
        // System.out.println("Searching with linear search:");
        // long start = System.currentTimeMillis();
        // int linearSearchId = linearSearch(books, idToSearchFor);
        // System.out.println("The search took " + (System.currentTimeMillis() - start)
        // + " milliseconds.");
        // if (linearSearchId < 0) {
        // System.out.println("Book not found");
        // } else {
        // System.out.println("Found it! " + books.get(linearSearchId));
        // }

        // System.out.println("");

        // System.out.println("");
        // System.out.println("Seaching with binary search:");
        // start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        // System.out.println("The search took " + (System.currentTimeMillis() - start)
        // + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            if (searchedId == books.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    // class Sortbyid implements Comparator<Book> {
    // // Used for sorting in ascending order of
    // // roll number
    // public int compare(Book a, Book b) {
    // return a.getId() - b.getId();
    // }
    // }

    /*
     * FAIL: SearchingTest binarySearchFindsTheBookWhenListSizeIsOne Binary search
     * didn't find a book in list contaiting one book, even though the book was on
     * the list. Try testing binary search with the following book: [(id: 248725;
     * name: name 248725)]
     */

    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        // Collections.sort(books);
        // for (Book book : books) {
        // System.out.println(book);
        // } cool test bro
        int begin = 0;
        int end = books.size() - 1;
        int middle = 0;
        // int times = 0;
        // while (begin < end && times < 10) {
        while (begin <= end) {
            middle = (end + begin) / 2;
            // System.out.println("Begin: " + begin);
            // System.out.println("End: " + end);
            // System.out.println("Middle: " + middle);
            // System.out.println("Searched Id: " + searchedId);
            // System.out.println("Books.get(middle).getID(): " +
            // books.get(middle).getId());
            if (books.get(middle).getId() == searchedId) {
                return middle;
            }
            if (books.get(middle).getId() < searchedId) {
                begin = middle + 1;
                // times++;
            }
            if (books.get(middle).getId() > searchedId) {
                end = middle - 1;
                // times++;
            }

        }
        // System.out.println("we're here");
        return -1;
    }
}
