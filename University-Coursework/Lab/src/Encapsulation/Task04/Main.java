package Encapsulation.Task04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[3];

        for(int i =0; i<products.length;i++){
            products[i] = new Product();
            System.out.println("~~~~~~~~~~");
            System.out.printf("Product %d\n",i);
            System.out.print("Enter Product name: ");
            products[i].setName(sc.nextLine());

            System.out.print("Enter Product price: ");
            products[i].setPrice(sc.nextDouble());

            System.out.print("Enter Product quantity: ");
            products[i].setQuantity(sc.nextInt());
            sc.nextLine();
            Product.totalInventoryValue += (products[i].getPrice()*products[i].getQuantity());
        }
        for(int i =0; i<products.length;i++){
            System.out.println("~~~~~~~~~~");
            System.out.printf("Product %d\n",i);
            System.out.printf("Product name: %s\n",products[i].getName());
            System.out.printf("Price: %.2f\nQuantity: %d\nTotal Value : %.2f\n",products[i].getPrice(),products[i].getQuantity(),products[i].getTotalValue());
        }
        System.out.printf("\nYour total Inventory value is %.2f",Product.totalInventoryValue);

    }
}
