public class ProductCatalog {

    public static void main(String[] args) {

        String[] products = {
            "Rice",
            "Tomato",
            "Onion",
            "Milk",
            "Bread"
        };

        System.out.println("===== Hasho Product Catalog =====");

        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
    }
}
