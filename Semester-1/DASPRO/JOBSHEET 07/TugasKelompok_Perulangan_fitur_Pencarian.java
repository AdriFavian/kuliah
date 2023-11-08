import java.util.Scanner;

public class TugasKelompok_Perulangan_fitur_Pencarian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the items
        Item[] itemList = new Item[10];

        // Add some sample items to the array
        itemList[0] = new Item("Item 1", 10, 5.0);
        itemList[1] = new Item("Item 2", 5, 2.5);
        itemList[2] = new Item("Item 3", 20, 10.0);

        System.out.print("Enter the name of the item you are searching for: ");
        String itemName = scanner.nextLine();

        // Search for the item using a for loop
        for (int i = 0; i < itemList.length ; i++) {
            if (itemList[i] != null && itemList[i].getName().equals(itemName)) {
                System.out.println("Item found:");
                System.out.println(itemList[i].toString());
                return;
            }
        }

        // If the item is not found, display an error message
        System.out.println("Item not found.");
    }
}

class Item {
    private String name;
    private int quantity;
    private double price;

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Name: " + name + ", Quantity: " + quantity + ", Price: " + price;
    }
}