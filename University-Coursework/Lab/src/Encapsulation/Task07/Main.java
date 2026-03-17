package Encapsulation.Task07;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books  = new Book[3];

        for (int i = 0; i < books.length; i++) {
            books[i] = new Book();
            System.out.println("~~~~~~~~~~~~~");
            System.out.printf("Book %d\n",i+1);
            System.out.print("Enter Book title: ");
            books[i].setTitle(sc.nextLine());
            System.out.print("Enter Book Author: ");
            books[i].setAuthor(sc.nextLine());
            System.out.print("Enter Book Price: ");
            books[i].setPrice(sc.nextDouble());
            sc.nextLine();
        }
        System.out.print("\nEnter the Book title to Search: ");
        String bookSearch = sc.nextLine();
        boolean isFound = false;
        for (Book b :books){
            if(b.getTitle().equalsIgnoreCase(bookSearch)){
                System.out.printf("~~~~~~~~~~~\nBook Details\nAuthor: %s\nTitle: %s\nPrice: %.2f",b.getAuthor(),b.getTitle(),b.getPrice());
                isFound =true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Book not Found.");
        }
    }
}
