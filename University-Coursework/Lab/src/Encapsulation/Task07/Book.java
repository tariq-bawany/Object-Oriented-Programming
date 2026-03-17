package Encapsulation.Task07;

public class Book {
    private String title;
    private String author;
    private double price;

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }else{
            System.out.println("Invalid Price Input.");
        }
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
