import java.util.Scanner;

public class VendorRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your shop name: ");
        String shopName = sc.nextLine();

        System.out.print("Enter the category: ");
        String category = sc.nextLine();

        System.out.print("Enter the delivery amount: ");
        double delivery = sc.nextDouble();

        System.out.print("Is the shop open? (true/false): ");
        boolean status = sc.nextBoolean();

        System.out.println("\n===== Vendor Registered =====");
        System.out.println("Vendor   : " + name);
        System.out.println("Shop     : " + shopName);
        System.out.println("Category : " + category);
        System.out.println("Delivery : ₹" + delivery);

        if (status) {
            System.out.println("Status   : Open");
        } else {
            System.out.println("Status   : Closed");
        }

        sc.close();
    }
}
