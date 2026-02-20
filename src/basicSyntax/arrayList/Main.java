package basicSyntax.arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        String[] namesArray = new String[10];
//        namesArray[0] = "Igor";
//        namesArray[1] = "João";
//
//        ArrayList<String> names = new ArrayList<>();
//
//        names.add("Igor");
//        names.add("João");
//        names.add("Victor");
//        names.add("Arthur");
//
//        System.out.println(names.get(0));
//
//        names.remove(0);
//        names.remove("João");
//
//        System.out.println(names.get(0));

        String[] nameArray = new String[10]; // armazena 10 elementos  pré-definidos
        nameArray[0] = "Igor";
        nameArray[1] = "Juan";

        ArrayList<String> names = new ArrayList<>(); // cria um array dinâmico, que aumenta ou diminui conforme a necessidade

        names.add("Igor");
        names.add("Juan");
        names.add("Victor");
        names.add("Arthur");

        System.out.println(names.get(0));

//        names.remove(0);
        names.removeFirst(); // Com o removerFirst não precisa referenciar o índice, ele remove o primeiro elemento da lista
        names.remove("Juan");

//        System.out.println(names.get(0));
        System.out.println(names.getFirst()); // Com o getFirst não precisa referenciar o índice, ele retorna o primeiro elemento da lista



    }
}
