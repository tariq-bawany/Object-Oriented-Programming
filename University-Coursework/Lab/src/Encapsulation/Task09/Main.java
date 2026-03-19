package Encapsulation.Task09;

import java.util.Scanner;

public class Main {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Car[] cars = new Car[3];

        for(int i =0;i< cars.length;i++){
            cars[i] =new Car();
            System.out.println("~~~~~~~~~~~~");
            System.out.printf("Car Details %d\n",i+1);
            System.out.print("Enter Car brand: ");
            cars[i].setBrand(sc.nextLine());
            System.out.print("Enter Car Year: ");
            cars[i].setYear(sc.nextInt());
            System.out.print("Enter Car Price: ");
            cars[i].setPrice(sc.nextDouble());
            sc.nextLine();
        }
        Car mostExpensive = cars[0];
        for(Car car:cars){
            if(mostExpensive.getPrice()<car.getPrice()){
                mostExpensive = car;
            }
        }

        System.out.printf("\nThe Most Expensive car is %s of %d model, and it is available for %.2f",mostExpensive.getBrand(),mostExpensive.getYear(),mostExpensive.getPrice());
    }

}
