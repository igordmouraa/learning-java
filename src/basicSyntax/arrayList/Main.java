package arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] namesArray = new String[10];
        namesArray[0] = "Igor";
        namesArray[1] = "João";

        ArrayList<String> names = new ArrayList<>();

        names.add("Igor");
        names.add("João");
        names.add("Victor");
        names.add("Arthur");

        System.out.println(names.get(0));

        names.remove(0);
        names.remove("João");

        System.out.println(names.get(0));
    }
}
