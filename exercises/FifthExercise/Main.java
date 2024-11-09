package exercises.FifthExercise;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Mouse", 100));
        products.add(new Product("Teclado", 180));
        products.add(new Product("Monitor", 500));

        for (Product product : products) {
            System.out.println("Produto: " + product.name + ", " + product.price);
        }
    }
}
