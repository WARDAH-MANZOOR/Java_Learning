package com.company.chapter10;

class Library {

    String[] availableBooks;
    String[] issuedBooks;
    int availableCount = 0;
    int issuedCount = 0;

    // Constructor
    Library() {
        availableBooks = new String[100];
        issuedBooks = new String[100];
    }

    // Add Book
    public void addBook(String book) {
        availableBooks[availableCount] = book;
        availableCount++;
        System.out.println(book + " added to library.");
    }

    // Issue Book
    public void issueBook(String book) {
        boolean found = false;

        for (int i = 0; i < availableCount; i++) {
            if (availableBooks[i].equals(book)) {
                found = true;

                issuedBooks[issuedCount] = book;
                issuedCount++;

                for (int j = i; j < availableCount - 1; j++) {
                    availableBooks[j] = availableBooks[j + 1];
                }
                availableBooks[availableCount - 1] = null;
                availableCount--;

                System.out.println(book + " has been issued.");
                break;
            }
        }

        if (!found) {
            System.out.println("Book not available.");
        }
    }

    // Return Book
    public void returnBook(String book) {
        boolean found = false;

        for (int i = 0; i < issuedCount; i++) {
            if (issuedBooks[i].equals(book)) {
                found = true;

                availableBooks[availableCount] = book;
                availableCount++;

                for (int j = i; j < issuedCount - 1; j++) {
                    issuedBooks[j] = issuedBooks[j + 1];
                }
                issuedBooks[issuedCount - 1] = null;
                issuedCount--;

                System.out.println(book + " has been returned.");
                break;
            }
        }

        if (!found) {
            System.out.println("This book was not issued.");
        }
    }

    // Show Available Books
    public void showAvailableBooks() {
        System.out.println("\nAvailable Books:");
        for (int i = 0; i < availableCount; i++) {
            System.out.println("- " + availableBooks[i]);
        }
    }
}

public class quiz {
    public static void main(String[] args) {

        Library lib = new Library();  // ✅ object create kiya

        // ✅ Add books
        lib.addBook("Java");
        lib.addBook("OOP");
        lib.addBook("DSA");

        // ✅ Show books
        lib.showAvailableBooks();

        // ✅ Issue book
        lib.issueBook("Java");

        // ✅ Show again
        lib.showAvailableBooks();

        // ✅ Return book
        lib.returnBook("Java");

        // ✅ Final list
        lib.showAvailableBooks();
    }
}