package Views;

import Controller.CustomerController;
import Controller.DeliveryBoyController;
import Controller.HotelController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Food Delivery System ....... ");
        System.out.println("Enter YOur choose : ");
        System.out.println("1. Hotel Login" +
                "2. Customer login" +
                "3. Delivery Boy login");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1 -> HotelController.hotel();
            case 2 -> CustomerController.customer();
            case 3 -> DeliveryBoyController.deliveryBoy();
            default -> System.out.println("Please Enter the Right Choice");
        }
    }
}
