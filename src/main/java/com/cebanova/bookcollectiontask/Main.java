package com.cebanova.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Book book1987 = new Book("1984", "George O.");
        Book bookBuyology = new Book("Buyology", "Martin L.");
        Book oameniiBook = new Book("Oamenii fericiti nu lucreaza si beau cafea", "Martin L.");
        Book ionBook = new Book("Ion", "Liviu R.");

//        System.out.println(ionBook.getTitle());

        Library classicLibrary = new Library("Librarius");

        classicLibrary.addBook(bookBuyology);
        classicLibrary.addBook(oameniiBook);
        classicLibrary.addBook(bookBuyology, ionBook);

        classicLibrary.printAllTheBooks();

        System.out.println("1.Numarul de carti este: " + classicLibrary.returnNumberBooks());

        classicLibrary.removeBook(3);

        classicLibrary.removeBook(book1987);

        System.out.println("2.Numarul de carti dupa stergere este: " + classicLibrary.returnNumberBooks());

        classicLibrary.removeBook("Buyology");

        System.out.println("3.Numarul de carti dupa stergere este: " + classicLibrary.returnNumberBooks());

//        classicLibrary.bookExists("Ion");

        classicLibrary.printAllTheBooks();

        Library literaLibrary = new Library("Litera");
        literaLibrary.addBook(ionBook, ionBook);
        literaLibrary.addBook(book1987, bookBuyology);
        literaLibrary.addBook(oameniiBook);
        System.out.println(literaLibrary.returnNumberBooks());

        Map<String, Library> librariesNetwork = new HashMap<>();
        librariesNetwork.put("str. Arborilor 22", classicLibrary);
        librariesNetwork.put("str.Vieru 14", literaLibrary);

        librariesNetwork.get("str.Vieru 14").addBook(ionBook);
        librariesNetwork.get("str. Arborilor 22").printAllTheBooks();
        librariesNetwork.get("str. Arborilor 22").addBook(ionBook);
        librariesNetwork.get("str. Arborilor 22").printAllTheBooks();

        librariesNetwork.get("str. Arborilor 22").addAnotherListOfBooksIntoTheLibraryList(literaLibrary.getBookList());
        librariesNetwork.get("str. Arborilor 22").printAllTheBooks();
    }
}
