package loops;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Igor");
        names.add("João");
        names.add("Victor");
        names.add("Arthur");


        // for(int i = 0; i < names.size(); i++){
        //     System.out.println(names.get(i));
        // }

        // for(String name: names){
        //     System.out.println("Name: " + name);
        // }

        int count = 0;
        while (count < 5) {
            System.out.println("I'm on while");
            count++;
        }
    }
}
