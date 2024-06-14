package generics;

public class MyIntegerCollection {

    private final MyInteger[] collection = new MyInteger[10];
    private int currentIndex = 0;

    public void add(MyInteger myInteger) {
        collection[currentIndex] = myInteger;
        currentIndex++;
    }

    public MyInteger get(int index) {
        return collection[index];
    }

}
