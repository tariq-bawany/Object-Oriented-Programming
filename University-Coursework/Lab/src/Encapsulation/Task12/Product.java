package Encapsulation.Task12;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        if(price>=0) this.price = price;
        else System.out.println("Invalid price Input.");
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        if(quantity>=0) this.quantity = quantity;
        else System.out.println("Invalid quantity Input.");
    }

    public int getQuantity() {
        return quantity;
    }
    public double getTotalValue(){
        return price*quantity;
    }
}
