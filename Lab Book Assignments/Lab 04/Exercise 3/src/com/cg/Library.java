package com.cg;

public class Library {
    public static void main(String[] args) {
        Book b = new Book(1234, "Harry Potter and The Philosopher's Stone", 5, "J.K. Rowling");
        b.addItems();
        b.print();
        System.out.println("After checkout, number of copies left: ");
        b.checkOut();
        b.print();
        System.out.println("After adding one element, number of copies left: ");
        b.addItems();
        b.print();

        System.out.println();

        Video v = new Video(4567, "The Godfather", 3, 178, "Francis Ford Coppola", "Crime/Drama", 1972);
        v.addItems();
        v.print();
        System.out.println("After checking in, number of copies left: ");
        v.checkIn();
        v.print();

        System.out.println();

        CD c = new CD(1090, "Heal the World", 2, 625, "Michael Jackson", "Pop");
        c.addItems();
        c.print();
        System.out.println("After checking out, number of copies left: ");
        c.checkOut();
        c.print();
    }
}
