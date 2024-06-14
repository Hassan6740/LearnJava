package generics;

import java.util.Objects;

public class MyInteger {

    private final int value;

    private static final MyInteger ONE = new MyInteger(1);
    private static final MyInteger TWO = new MyInteger(2);
    private static final MyInteger THREE = new MyInteger(3);
    private static final MyInteger FOUR = new MyInteger(4);
    private static final MyInteger FIVE = new MyInteger(5);
    private static final MyInteger SIX = new MyInteger(6);
    private static final MyInteger SEVEN = new MyInteger(7);
    private static final MyInteger EIGHT = new MyInteger(8);
    private static final MyInteger NINE = new MyInteger(9);
    private static final MyInteger TEN = new MyInteger(10);


    private MyInteger(int value) {
        this.value = value;
    }

    //Factory Method
    public static MyInteger valueOf(int value) {
        return switch (value) {
            case 1 -> ONE;
            case 2 -> TWO;
            case 3 -> THREE;
            case 4 -> FOUR;
            case 5 -> FIVE;
            case 6 -> SIX;
            case 7 -> SEVEN;
            case 8 -> EIGHT;
            case 9 -> NINE;
            case 10 -> TEN;
            default -> new MyInteger(value);
        };

    }

    public int intValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyInteger myInteger)) return false;
        return value == myInteger.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
