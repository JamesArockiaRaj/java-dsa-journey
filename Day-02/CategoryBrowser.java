import java.util.Scanner;

public class CategoryBrowser {

    public static void main(String[] args) {

        String[] categories = {
            "Groceries",
            "Vegetables",
            "Meat & Fish",
            "Food",
            "Stationery"
        };

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Hasho Categories =====");

        for (int i = 0; i < categories.length; i++) {
            System.out.println((i + 1) + ". " + categories[i]);
        }

        System.out.print("\nChoose category number: ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= categories.length) {
            System.out.println("You selected: " + categories[choice - 1]);
        } else {
            System.out.println("Invalid category.");
        }

        sc.close();
    }
}
