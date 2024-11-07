package castings;

public class Main {
    public static void main(String[] args) {
        // Transforma um número decimal para um inteiro
        double result = 0.0;
        int resultInt = (int)result;
        System.out.println(resultInt);

        // Transforma uma string em um número inteiro
        String myString = "10";
        int myInt = Integer.parseInt(myString);
        System.out.println(myInt);


        //Transforma um número inteiro em uma string
        String theString = String.valueOf(myInt);
        System.out.println(theString);

    }
}
