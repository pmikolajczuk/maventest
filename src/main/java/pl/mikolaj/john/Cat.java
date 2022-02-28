package pl.mikolaj.john;

import pl.mikolaj.john.lambdas.Printable;

import java.util.function.BiFunction;

public class Cat implements Printable, BiFunction<String, String, String> {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public String print(String prefix, String suffix) {
        System.out.println("Meow");
        return "";
    }

    @Override
    public String apply(String s, String s2) {
        return print(s, s2);
    }
}
