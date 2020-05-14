package bookstoreLab;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bookstore parkroad = new Bookstore("Park Road", " used books", "2024 Park Road", "7pm", 400, 15, true);
        System.out.println("Welcome to " + parkroad.getStoreName());
        System.out.println("We have " + parkroad.getUsedBooks());
        System.out.println("The address is  " + parkroad.getstoreAddress());
        System.out.println("We close at  " + parkroad.getclosingTime());
        System.out.println("The store square footage is " + parkroad.getUsedBooks());
        System.out.println("We have this many books: " + parkroad.getNumberBooks());
        System.out.println("We are open today? " + parkroad.getOpenToday());

        parkroad.gettitles();
        // parkroad.findBook();

    }
}
