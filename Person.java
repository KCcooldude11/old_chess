import java.util.*;
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.printf("%s is sleeping", name);
    }
    public static void main(String[] args){
        var inventor = new Person("James Gosling");
        inventor.sleep();
        var nameBuilder = new StringBuilder();
        nameBuilder.append("Jonathan");
        nameBuilder.append(" ");
        nameBuilder.append("Groff");

        var name = nameBuilder.toString();
        System.out.println(name);
    }

}

