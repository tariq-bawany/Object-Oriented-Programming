package Encapsulation.Task04;

public class Product {
    private String name;
    private double price;
    private int quantity;
    static double totalInventoryValue = 0;

    public double getTotalValue(){
        return price*quantity;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        if (price < 0) {
//            this.price = 0;
            System.out.println("Invalid price input ");
        } else {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
//            this.quantity = 0;
            System.out.println("Invalid quantity input ");
        } else {
            this.quantity = quantity;
        }
    }

    public int getQuantity() {
        return quantity;
    }
}
