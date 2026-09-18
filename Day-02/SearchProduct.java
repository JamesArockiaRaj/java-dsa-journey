public class SearchProduct {

    public static void main(String[] args) {

        String[] products = {
            "Rice",
            "Tomato",
            "Onion",
            "Milk",
            "Bread"
        };

        String search = "Milk";
        boolean found = false;

        for (int i = 0; i < products.length; i++) {

            if (products[i].equals(search)) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(search + " found.");
        else
            System.out.println(search + " not found.");
    }
}
