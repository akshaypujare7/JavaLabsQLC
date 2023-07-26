package com.qa;

public class TestBooks {
    public static void main(String[] args) {
        String[] arr = {"Mike", "Martina", "Peter"};
        Book b1 = new Book("title", arr, 10.99);
        Book b2 = new Book("title2", arr, 5.99);
        Book b3 = new Book("title3", arr, 1.00);
        Cars c1 = new Cars("X5", "BMW", 70000);
        Cars c2 = new Cars("TLX", "Acura", 30000);
        Cars c3 = new Cars("Elantra", "Hyundai", 25000);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        Book[] bookArray = new Book[3];

        bookArray[0] = b1;
        bookArray[1] = b2;
        bookArray[2] = b3;

        for (int x = 0; x < bookArray.length; x++) {
            System.out.println(bookArray[x]);
        }
    }
}
