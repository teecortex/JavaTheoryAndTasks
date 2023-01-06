package com.company;

public class Main {
    public static void main(String[] args) {
        Printable[] booksAndMagazines = new Printable[5];
        booksAndMagazines[0] = new Book("abc");
        booksAndMagazines[1] = new Book("abcdef");
        booksAndMagazines[2] = new Magazine("defgj");
        booksAndMagazines[3] = new Magazine("uiohj");
        booksAndMagazines[4] = new Magazine("mimo");
        for (Printable eachElement : booksAndMagazines){
            eachElement.print();
        }
        Magazine.printMagazines(booksAndMagazines);
        Book.printBooks(booksAndMagazines);
    }
}


