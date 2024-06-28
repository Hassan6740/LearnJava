package util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalUtil {


    public static <T> List<T> filter(List<T> list, Predicate<T> criteria) {
        List<T> result = new ArrayList<>();
        for (T obj : list) {
            if (criteria.test(obj)) {
                result.add(obj);
            }
        }
        return result;
    }

    public static <T> void forEach(List<T> filtered, Consumer<T> consumer) {
        for (T t : filtered) {
            consumer.accept(t);
        }
    }

    public static <T, R> List<R> map(List<T> students, Function<T, R> function) {
        List<R> names = new ArrayList<>();
        for (T student : students) {
            R name = function.apply(student);
            names.add(name);
        }
        return names;
    }


}
