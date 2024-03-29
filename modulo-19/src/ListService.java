import java.util.List;

public class ListService {
    public static <T> void displayAll(List<T> list) {
        if (list.getFirst() == null) {
            throw new IllegalArgumentException("List void");
        }
        for (T item : list) {
            System.out.println(item);
        }
    }
    public static <T> T first(List<T> list) {
        return list.getFirst();
    }
    public static <T> T last(List<T> list) {
        return list.getLast();
    }
}
