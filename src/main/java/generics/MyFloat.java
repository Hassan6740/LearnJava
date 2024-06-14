package generics;

import java.util.Objects;

public class MyFloat {

    private final float value;

    private MyFloat(float value) {
        this.value = value;
    }

    public static MyFloat valueOf(float value) {
        return new MyFloat(value);
    }

    public float floatValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyFloat myFloat)) return false;
        return Float.compare(value, myFloat.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
