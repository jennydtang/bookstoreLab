package bookstoreLab;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Bookstore parkroad = new Bookstore("Park Road", "has used books", 300);
        System.out.println(parkroad.getNumberBooks());
        parkroad.gettitles();

    }
}
