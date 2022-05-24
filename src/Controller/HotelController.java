package Controller;
import Models.Hotels;
import Models.Food;
import java.util.Scanner;
import java.util.ArrayList;
public class HotelController{
    static ArrayList<Hotels> hotelList = new ArrayList<Hotels>();
    public static void hotel(){
        System.out.println("Enter Your Choice....");
        System.out.println("1. Register your account"+
        "2. Login to our account");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        switch(choice){
            case 1:
                System.out.println("Enter Your Hotel Name:");
                String name = scanner.nextLine();
                Hotels hotel = new Hotels(name);
                hotelList.add(hotel);
                
            case 2:
                System.out.println("Select Your hotel from the list");
                HotelController.displayHotels();
                System.out.println("Enter Your Choice....");
                System.out.println("1.Add food");
                System.out.println("2.Remove food");
                int hotelChoice = Integer.parseInt(scanner.nextLine());
                switch(choice){
                    case 1: 
                    System.out.println("Enter the food item to add");
                    String food = scanner.nextLine();
                    System.out.println("Enter the quantity");
                    long quantity = Long.parseLong(scanner.nextLine());
                    System.out.println("Enter the price");
                    double price = Double.parseDouble(scanner.nextLine()); 
                    hotelList.get(hotelChoice).addFood(new Food(food, quantity, price));
                    case 2:
                    System.out.println("Select the food item to remove");
                    HotelController.displayFood();
                    int FoodChoice = Integer.parseInt(scanner.nextLine());
                    hotelList.get(hotelChoice).removeFood(Hotels.FoodItems.get(FoodChoice));                    

                }
        }
    }
    public static void displayHotels(){
        for(int i = 0; i < hotelList.size(); i++){
            System.out.println((i+1)+"."+hotelList.get(i).getName());
        }
    }
    public static void displayFood(){
        for(int i = 0; i < Hotels.FoodItems.size(); i++){
            System.out.println((i+1)+"."+Hotels.FoodItems.get(i).getName());
        }
    }
}