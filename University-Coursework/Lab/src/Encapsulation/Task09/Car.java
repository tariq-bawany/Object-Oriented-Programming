package Encapsulation.Task09;

public class Car {
    private String brand;
    private double price;
    private int year;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>=0) this.price = price;
        else System.out.println("Invalid Prive Input.");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>=1990) this.year = year;
        else System.out.println("Invalid Year Input.");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
