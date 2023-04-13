/*
 * This class include all of features that can be used in the program
 */

public class Features {
    //create an array of Items object and an index to store the data
    Items[] items = new Items[100];
    int index;

    //method input/add item data
    public void addItem(Items item) {
        //check if the storage is full or not
        if (index < items.length) {
            //store the data to the array
            items[index] = item;
            index++;
        } else {
            //display the message if the storage is full
            System.out.println("Storage is full");
        }
    }

    //method display all item data
    public void displayAll() {
        //looping using for each to display all item
        for (Items item : items) {
            //check if the item is not null
            if (item != null) {
                //display the item data
                System.out.println();
                System.out.println("Item Code: " + item.itemCode);
                System.out.println("Name : " + item.name);
                System.out.println("Category : " + item.category);
                System.out.println("Initial stock : " + item.stock);
                System.out.println();
            }
        }
    }

    //method display item data based on the stock values in ascending mode using insertion sort
    public void sortStock() {
        //looping to sort the item data based on the stock values in ascending mode
        for (int i = 1; i < items.length; i++) {
            //check if the item is not null
            if (items[i] != null) {
                //store the item data to the temporary variable
                Items temp = items[i];
                //store the index of the item data
                int j = i;
                //looping to sort the item data
                while (j > 0 && items[j - 1].stock < temp.stock) {
                    //move the item data to the next index
                    items[j] = items[j - 1];
                    j--;
                }
                //store the item data to the index
                items[j] = temp;
            }
        }
        //looping to display all item
        for (Items item : items) {
            //check if the item is not null
            if (item != null) {
                //display the item data
                System.out.println();
                System.out.println("Item Code: " + item.itemCode);
                System.out.println("Name : " + item.name);
                System.out.println("Category : " + item.category);
                System.out.println("Initial stock : " + item.stock);
                System.out.println();
            }
        }
    }

    //method display item data classified as food that have no stock
    public void displayFoodNoStock() {
        //looping to display all item
        for (Items item : items) {
            //check if the item is not null
            if (item != null) {
                //check if the item category is food and the stock is 0
                if (item.category.equalsIgnoreCase("food") && item.stock == 0) {
                    //display the item data
                    System.out.println();
                    System.out.println("Item Code: " + item.itemCode);
                    System.out.println("Name : " + item.name);
                    System.out.println("Category : " + item.category);
                    System.out.println("Initial stock : " + item.stock);
                    System.out.println();
                }
            }
        }
    }

    //method search item data based on the name keyword using sequential search
    public void searchItem(String keyword) {
        //looping to search the item data based on the name keyword
        for (Items item : items) {
            //check if the item is not null
            if (item != null) {
                //check if the item name contains the keyword
                if (item.name.equalsIgnoreCase(keyword)) {
                    //display the item data
                    System.out.println();
                    System.out.println("Item Code: " + item.itemCode);
                    System.out.println("Name : " + item.name);
                    System.out.println("Category : " + item.category);
                    System.out.println("Initial stock : " + item.stock);
                    System.out.println();
                }
            }
        }
    }

    //method add the stock for certain item
    public void addStock(String itemCode, int stock) {
        //looping to find the item
        for (Items item : items) {
            //check if the item code is equal to the item code that we want to add the stock
            if (item != null && item.itemCode.equalsIgnoreCase(itemCode)) {
                //add the stock
                item.stock += stock;
            }
        }
    }

    //method decrease the stock for certain item
    public void decreaseStock(String itemCode, int stock) {
        //looping to find the item
        for (Items item : items) {
            //check if the item code is equal to the item code that we want to decrease the stock
            if (item != null && item.itemCode.equalsIgnoreCase(itemCode)) {
                //decrease the stock
                item.stock -= stock;
            }
        }
    }
}
