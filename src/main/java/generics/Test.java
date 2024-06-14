package generics;

import java.util.ArrayList;
import java.util.List;

public class Test {

    //TODO LTS/Non LTS intro

    public static void main(String[] args) {

//        MyFloat one = MyFloat.valueOf(1);
//        MyFloat two = MyFloat.valueOf(2);
//        MyFloat three = MyFloat.valueOf(3);
//        MyFloat four = MyFloat.valueOf(4);
//
//        MyCollection<MyFloat> intCollection = new MyCollection<>();
//        intCollection.add(one);
//        intCollection.add(two);
//        intCollection.add(three);
//        intCollection.add(four);
//
//        System.out.println(intCollection.get(0));
//        System.out.println(intCollection.get(1));
//        System.out.println(intCollection.get(2));
//        System.out.println(intCollection.get(3));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Integer one = list.get(0);
        Integer two = list.get(1);
        Integer three = list.get(2);
        Integer four = list.get(3);



    }

//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    public static float add(float a, float b) {
//        return a + b;
//    }

}
