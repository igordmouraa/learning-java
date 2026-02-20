package basicSyntax.vectors;

public class Main {
    public static void main(String[] args) {
        // Armazena somente 5 elementos pré-definidos
        int[] integersCollection = {
                1, 2, 3, 4, 5
        };
        System.out.println(integersCollection[0]);

        String[] stringCollection = {
                "One", "Two", "Three", "Four", "Five"
        };
        System.out.println(stringCollection[1]);

        // Armazena 10 elementos 
        int[] myNumbers = new int[10];
        myNumbers[0] = 1;

        System.out.println(myNumbers[0]);

    }
}
