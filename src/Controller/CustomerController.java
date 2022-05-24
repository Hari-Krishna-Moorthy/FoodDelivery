package Controller;

import Models.Customers;
import Models.Hotels;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerController {
    static Scanner scanner = null;
     static List<Customers> customersList = null;
    public static void customer() {
        scanner = new Scanner(System.in);
        customersList = new ArrayList<>();
        System.out.println("Enter the Choose : ");
        System.out.println("1. Register Customer" +
                "2. Login Customer" +
                "3. Order Food");
        int Choice = scanner.nextInt();
        switch (Choice) {
            case 1 -> registerUser();
            case 2 -> loginUser();
            default -> System.out.println("Please enter the Right Choice");
        }

    }

    private static void loginUser() {
        System.out.println("please enter the your name : ");
        String name = scanner.nextLine();
        boolean customersNameFound = false;
        for(Customers customers : customersList) {
            if(customers.getCustomerName().equals(name)) {
                customersNameFound = true;
                break;
            }
        }
        if(!customersNameFound) {
            System.out.println("Invalid Customer name");
            return;
        }
        System.out.println("please enter the Hotel name : ");
        String HotelName = scanner.nextLine();
        
    }

    private static void registerUser() {
        System.out.println("Enter the Customer Name : ");
        String name = scanner.nextLine();
        customersList.add(new Customers(name));
        loginUser();
    }
}
