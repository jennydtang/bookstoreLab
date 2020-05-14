package bookstoreLab;

import java.io.IOException;
import java.util.ArrayList;

// Class Definition
public class Bookstore {
    private String StoreName;
    private String UsedBooks;
    private int NumberBooks;
    public char[] getNumberBooks;
    private ArrayList<String> titles;

    // create a Constructor (Overloading)
    // public Bookstore() {
    // System.out.println("Testing Empty Constructor");
    // }
    public Bookstore(String StoreName, String UsedBooks, int NumberBooks) {
        // test
        // System.out.println("New Constructor");
        this.StoreName = StoreName;
        this.UsedBooks = UsedBooks;
        this.NumberBooks = NumberBooks;
        titles = new ArrayList<String>();
        loadTitles();
    }

    private void loadTitles() {
        try {
            Utils.loadStringsToArray(this.titles);
        } catch (IOException e) {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();

        }
    }

    public void gettitles() {
        for (int i = 0; i < 10; i++) {
            System.out.println(titles.get(i));
        }
    }

    // create a Method(setter)
    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }

    // create a getter
    public String getStoreName() {
        return this.StoreName;
    }

    // getter and setter for Used Books
    public void setUsedBooks(String UsedBooks) {
        this.UsedBooks = UsedBooks;
    }

    public String getUsedBooks() {
        return this.UsedBooks;
    }

    // getter and setter for Used Books
    public void setNumberBooks(int NumberBooks) {
        this.NumberBooks = NumberBooks;
    }

    public int getNumberBooks() {
        return this.NumberBooks;
    }
}
