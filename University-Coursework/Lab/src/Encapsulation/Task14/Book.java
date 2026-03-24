package Encapsulation.Task14;

public class Book {
    private String title;
    private String author;
    private int copies;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCopies(int copies) {
        if(copies>=0)this.copies = copies;
        else System.out.println("Copies Can't be Negative");
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getCopies() {
        return copies;
    }
}
