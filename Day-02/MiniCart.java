import java.util.Scanner;

public class MiniCart {

    public static void main(String[] args) {

        String[] products = {
            "Rice",
            "Tomato",
            "Onion",
            "Milk",
            "Bread"
        };

        int[] prices = {60, 40, 35, 30, 20};

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Hasho Products =====");

        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + "   ₹" + prices[i]);
        }

        System.out.print("\nChoose product number: ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= products.length) {

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            int total = prices[choice - 1] * quantity;

            System.out.println("\n===== Bill =====");
            System.out.println("Product  : " + products[choice - 1]);
            System.out.println("Price    : ₹" + prices[choice - 1]);
            System.out.println("Quantity : " + quantity);
            System.out.println("Total    : ₹" + total);

        } else {
            System.out.println("Invalid product number.");
        }

        sc.close();
    }
}
