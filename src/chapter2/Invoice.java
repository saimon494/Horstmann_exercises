package chapter2;

import java.util.ArrayList;
import java.util.Arrays;

// task 15 - static nested class

public class Invoice {
    private static class Item {
        String description;
        int quantity;
        double unitPrice;

        double price () {
            return quantity * unitPrice;
        }
     }

    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }

    private ArrayList<Item> items = new ArrayList<>();

    public ArrayList getItems(){
        for (int i = 0; i < items.size(); i++) {
            items.get(i);
        }
        return items;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
