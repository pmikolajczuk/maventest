package pl.mikolaj.old.computer;

import java.util.Objects;

public final class Headphones {
    private final String name;

    Headphones(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Headphones that = (Headphones) obj;
        return Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Headphones[" +
                "name=" + name + ']';
    }

}
