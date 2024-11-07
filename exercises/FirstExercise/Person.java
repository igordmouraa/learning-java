package exercises.FirstExercise;

public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayData(){
       System.out.println(this.name + this.age); 
    }
}
