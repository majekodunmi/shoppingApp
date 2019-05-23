package Majekodunmi;

import java.util.Scanner;
import java.util.List;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ShoppingList shoppingList = new ShoppingList();

    public static void main(String[] args) {

        boolean stop = false;
        int option = 0;
        printInstruction();

        while (!stop) {
            System.out.println("************************************* ");
            System.out.println("Enter Option:");

            boolean choiceInput = scanner.hasNextInt();
            if (choiceInput) {
                option = scanner.nextInt();
                scanner.nextLine();

            } else {
                System.out.println("Invalid Option!!");
                scanner.nextLine();
            }

            switch (option) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    addItem();
                    break;
                case 2:
                    shoppingList.printShoppingList();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchList();
                    break;
                case 6:
                    stopApp();
                    stop = true;
                    break;
            }

        }
    }

         public static void printInstruction(){
             System.out.println("WELCOME TO THE SHOPPING LIST APP!!!");
             System.out.println("******************************************************");
             System.out.println("Press:");
             System.out.println("\t0 - To print instructions.");
             System.out.println("\t1 - To add items to the Shopping List.");
             System.out.println("\t2 - To print items in the Shopping List.");
             System.out.println("\t3 - To modify an item in the Shopping List.");
             System.out.println("\t4 - To remove an item from the Shopping List.");
             System.out.println("\t5 - To search for an item in the Shopping List.");
             System.out.println("\t6 - To terminate the App.");
    }

    public static void addItem() {
        System.out.print("Please enter an item to add the shopping List: ");
        shoppingList.addItem(scanner.nextLine().toLowerCase());
        System.out.println("Item succesfully added to the List.");


    }

    public static void modifyItem(){
        System.out.print("Old item name: ");
        String oldItem = scanner.nextLine().toLowerCase();
        System.out.print("Enter new item: ");
        String newItem = scanner.nextLine().toLowerCase();
        shoppingList.modifyItem(oldItem, newItem);
    }

    public static void removeItem(){
        System.out.print("Item to be removed: ");
        String item = scanner.nextLine().toLowerCase();
        shoppingList.removeItem(item);

    }


    public static void searchList(){
        System.out.print("Search Item: ");
        String item = scanner.nextLine().toLowerCase();
        if (shoppingList.searchFile(item)) {
            int foundItem = shoppingList.findItem(item) + 1;
               System.out.println( item + " is found in the shopping list at number " + foundItem );
            }

           else {
                System.out.println(item.toUpperCase() + " is not in the shopping list.");

            }
    }

    public static void stopApp(){
        System.out.println("Thanks for using the Shopping List App");
        System.out.println("Application Terminated!!!");
    }
}
