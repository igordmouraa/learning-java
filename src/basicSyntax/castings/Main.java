package basicSyntax.castings;

public class Main {
    public static void main(String[] args) {
        // Transforma um número decimal para um inteiro
//        double result = 0.0;
//        int resultInt = (int)result;
//        System.out.println(resultInt);
//
//        // Transforma uma string em um número inteiro
//        String myString = "10";
//        int myInt = Integer.parseInt(myString);
//        System.out.println(myInt);
//
//
//        //Transforma um número inteiro em uma string
//        String theString = String.valueOf(myInt);
//        System.out.println(theString);

        double number = 10;
        int result2 = (int)number;
        System.out.println(result2);

        String stringNum = "15";
        int result3 = Integer.parseInt(stringNum);
        System.out.println(result3);

        String result4 = String.valueOf(result3);
        System.out.println(result4);


    }
}
