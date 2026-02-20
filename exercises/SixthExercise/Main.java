package exercises.SixthExercise;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] products = new String[10];
        products[0] = "Notebook";
        products[1] = "Smartphone";
        products[2] = "Tablet";

        ArrayList<String> productsList = new ArrayList<>();

        for (String product : products) {
            if (product != null) {
                productsList.add(product);
            }
        };

        System.out.println("Estoque inicial: " + productsList);

        newLoading(productsList);
        System.out.println("Estoque atual: " + productsList);

        sellProduct(productsList, "Smartphone");
        System.out.println("Estoque final: " + productsList);
    }

    public static void newLoading(ArrayList<String> stock) {
        stock.add("Monitor");
        stock.add("Keyboard");
        stock.add("Mouse");

        System.out.println("Novos produtos carregados no estoque.");
    }

    public static void sellProduct(ArrayList<String> stock, String product) {
        if(stock.contains(product)) {
            stock.remove(product);
            System.out.println("Produto vendido: " + product);
        } else {
            System.out.println("Produto não encontrado no estoque: " + product);
        }
    }
}
