package generics;

public class MyCollection<T> {

    private final Object[] collection = new Object[10];
    private int currentIndex = 0;

    public void add(T myInteger) {
        collection[currentIndex] = myInteger;
        currentIndex++;
    }

    public T get(int index) {
        return (T) collection[index];
    }

}
