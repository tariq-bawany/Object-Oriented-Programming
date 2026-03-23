package Encapsulation.Task12;


import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        arrays of objects
        Product[] products = new Product[5];
//        user input for arrays of object
        for(int i =0;i<products.length;i++){
            products[i] = new Product();
            System.out.println("~~~~~~~~~~~~~");
            System.out.printf("Product Details %d\n",i+1);
            System.out.print("Enter name: ");
            products[i].setName(sc.nextLine());
            System.out.print("Enter price: ");
            products[i].setPrice(sc.nextDouble());
            System.out.print("Enter quantity: ");
            products[i].setQuantity(sc.nextInt());
//          clears buffer
            sc.nextLine();
        }

        Product temp;
//        sorting the arrays of object in descending order according to price using Bubble Sort algorithm
        for(int i =0; i<products.length-1;i++){
            for (int j=0;j< products.length-1-i;j++){
                if(products[j].getPrice()<products[j+1].getPrice()){
                    temp = products[j];
                    products[j] = products[j+1];
                    products[j+1] =temp;
                }
            }
        }
//        displays the sorted arrays of objects
        for(Product product:products){
            System.out.printf("Name: %s || Price: %.2f || Quantity: %d\n",product.getName(),product.getPrice(),product.getQuantity());
        }
    }
}
