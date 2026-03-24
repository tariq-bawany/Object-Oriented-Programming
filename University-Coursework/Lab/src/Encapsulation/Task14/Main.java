package Encapsulation.Task14;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        arrays of objects declaration
        Book[] books = new Book[3];

//        user input for arrays of objects
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book();
            System.out.println("~~~~~~~~~~~~");
            System.out.printf("Book Details %d\n", i + 1);
            System.out.print("Enter title: ");
            books[i].setTitle(sc.nextLine());
            System.out.print("Enter author: ");
            books[i].setAuthor(sc.nextLine());
            System.out.print("Enter copies: ");
            books[i].setCopies(sc.nextInt());
            sc.nextLine();
        }

        System.out.println("\nBook Menu Program");
        int selectedOption;
        do {
            System.out.print("1) Show all books\n2) Borrow a book\n3) Return a book\n4) Exit\nSelect any option (1-4):");
            selectedOption = sc.nextInt();
            sc.nextLine();
            switch (selectedOption) {
                case 1 -> {
                    for (Book book : books) {
                        System.out.printf("~~~~~~~~~~~~~~\nBook Title: %s\nBook Author: %s\nBook Copies: %d\n", book.getTitle(), book.getAuthor(), book.getCopies());
                    }
                }
                case 2 -> {
                    System.out.print("Enter Book title for borrowing:");
                    String bookTitle = sc.nextLine();
                    boolean isFound = false;
                    for (Book book : books) {
                        if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                            isFound = true;
                            if (book.getCopies() > 0) {
//                                System.out.printf("Original Copies: %d\n", book.getCopies());
                                book.setCopies(book.getCopies() - 1);
                                System.out.println("Successfully Book Borrowed.\n~~~~~~~~~~~~~~~~");
//                                System.out.printf("After Borrowing Copies: %d\n", book.getCopies());
                            } else {
                                System.out.print("No Copies Available\n~~~~~~~~~~~~~~~~\n");
                            }
                            break;
                        }
                    }
                    if (!isFound) System.out.println("Book not found.\n~~~~~~~~~~~~~~~~");
                }
                case 3 -> {
                    System.out.print("Enter Book title for Return:");
                    String bookTitle = sc.nextLine();
                    boolean isFound = false;
                    for (Book book : books) {
                        if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                            isFound = true;
//                            System.out.printf("Original Copies: %d\n", book.getCopies());
                            book.setCopies(book.getCopies() + 1);
//                            System.out.printf("After Returning Copies: %d\n", book.getCopies());
                            System.out.println("Successfully Book Returned\n~~~~~~~~~~~~~~~~");
                            break;
                        }
                    }
                    if (!isFound) System.out.println("Book not found.\n~~~~~~~~~~~~~~~~");
                }
                case 4 -> System.out.println("Successfully Exited the Program");
                default -> System.out.println("Invalid option selected");

            }
        } while (selectedOption != 4);
    }
}
