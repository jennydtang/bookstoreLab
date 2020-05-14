package bookstoreLab;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Class Definition
public class Bookstore {
    private String StoreName;
    private String UsedBooks;
    private String storeAddress;
    private String closingTime;
    private int squareFootage;
    private int NumberBooks;
    private boolean OpenToday;
    private ArrayList<String> titles;

    // create a Constructor (Overloading)
    // public Bookstore() {
    // System.out.println("Testing Empty Constructor");
    // }
    public Bookstore(String StoreName, String UsedBooks, String storeAddress, String closingTime, int squareFootage,
            int NumberBooks, boolean OpenToday) {
        // test
        // System.out.println("New Constructor");
        this.StoreName = StoreName;
        this.UsedBooks = UsedBooks;
        this.storeAddress = storeAddress;
        this.closingTime = closingTime;
        this.squareFootage = squareFootage;
        this.NumberBooks = NumberBooks;
        this.OpenToday = OpenToday;
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

    // setter and getter for storeAddress
    public void setstoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getstoreAddress() {
        return this.storeAddress;
    }

    // setter and getter for closing time
    public void setclosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    public String getclosingTime() {
        return this.closingTime;
    }

    // setter and getter for Square Footage
    public void setsquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int setsquareFootage() {
        return this.squareFootage;
    }

    // setter and getter for Open Today
    public void setOpenToday(boolean OpenToday) {
        this.OpenToday = OpenToday;
    }

    public boolean getOpenToday() {
        return this.OpenToday;
    }

    public void findBook(String bookkeyword) {
        for (String string : titles) {
            if (string.contains(bookkeyword)) {
                System.out.println("Here is a book with your key word: " + string);

            }
        }
    }
}
