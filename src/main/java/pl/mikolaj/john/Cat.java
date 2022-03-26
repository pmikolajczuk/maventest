package pl.mikolaj.john;

import pl.mikolaj.john.lambdas.Printable;

import java.io.Serializable;
import java.util.function.BiFunction;

public class Cat extends Animal implements Printable, Serializable {

    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public String print(String prefix, String suffix) {
        System.out.println("Meow");
        return "";
    }

}
