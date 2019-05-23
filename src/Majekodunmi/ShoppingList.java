package Majekodunmi;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private List<String> shoppingList = new ArrayList<>();

    public List<String> getShoppingList() {
        return shoppingList;
    }

    public void addItem(String item) {
        shoppingList.add(item);
    }


    public int findItem(String searchItem) {
        return shoppingList.indexOf(searchItem);
    }

    public boolean searchFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >=0) {
            return true;
        }

        return false;
    }

    public void removeItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            shoppingList.remove (position);
            System.out.println("Grocery item " + (position + 1) + " has been removed.");
        }

        else {
            System.out.println( "'" + item.toUpperCase() + "' not on the List!!");
        }

    }

    public void modifyItem(String oldItem, String newItem) {
        int position = findItem(oldItem);
        if (position >= 0) {
            shoppingList.set(position, newItem);
            System.out.println("Grocery item " + (position + 1) + " has been modified.");
        }

        else {
            System.out.println("Unsuccessful");
            System.out.println("'" + oldItem.toUpperCase()+ "' not found on the List!!");
        }

    }

    public void printShoppingList(){
        System.out.println("You have " + shoppingList.size() + " items in your shopping list");

        int i = 0;
        while(i < shoppingList.size()){
            System.out.println((i+1) + ". " + shoppingList.get(i));
            i++;
        }

    }

}
