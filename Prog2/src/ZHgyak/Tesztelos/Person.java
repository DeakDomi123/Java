package ZHgyak.Tesztelos;

import java.util.Objects;

public class Person implements InfoInterface{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void greet(){
        System.out.println("Hello there.");
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
