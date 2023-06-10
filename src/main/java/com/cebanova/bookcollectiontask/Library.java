package com.cebanova.bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;
    private String name;

    public Library(String inputname) {
        this.name = inputname;
        bookList = new ArrayList<>();
    }

    public void addBook(Book inputBook) {
        bookList.add(inputBook);
    }

    public void addBook(Book book1, Book book2) {
        bookList.add(book1);
        bookList.add(book2);
    }

    public int returnNumberBooks() {
        return bookList.size();
    }

    public void removeBook(int elementPosition) {
        try {
            Book deletedBook = bookList.remove(elementPosition);
            System.out.println("The following book was deleted: " + deletedBook.getTitle());
        } catch (IndexOutOfBoundsException exceptionObject) {
            System.out.println("Please review the index: " + exceptionObject.getMessage());
        }
    }

    public void removeBook(Book removedBook) {
        boolean isDeleted = bookList.remove(removedBook);
        if (isDeleted) {
            System.out.println("The book was deleted: " + removedBook.getTitle());
        } else {
            System.out.println("There is not such a book: " + removedBook.getTitle());
        }
    }

    public void removeBook(String bookTitle) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle() == bookTitle) {
                bookList.remove(i);
                break;
            }
        }
    }

//    public void bookExists(String inputTitle) {
//        boolean bookExists = bookList.contains(true);
//        if (bookExists) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//    }

    public void printAllTheBooks() {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("The book nr " + i + " is: " + bookList.get(i).getTitle() + " by " + bookList.get(i).getAuthor());
        }
    }

    public void addAnotherListOfBooksIntoTheLibraryList(List<Book> anotherListOfBooks) {
        this.bookList.addAll(anotherListOfBooks);
    }

    public List<Book> getBookList() {
        return this.bookList;
    }
}