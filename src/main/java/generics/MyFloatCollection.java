package generics;

public class MyFloatCollection {

    private final MyFloat[] collection = new MyFloat[10];
    private int currentIndex = 0;

    public void add(MyFloat myInteger) {
        collection[currentIndex] = myInteger;
        currentIndex++;
    }

    public MyFloat get(int index) {
        return collection[index];
    }

}
