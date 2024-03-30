package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    private List<T> numbers = new ArrayList<>();
    public void addValue(T value) {
        numbers.add(value);
    }

    public T first() {
        if (numbers.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return numbers.getFirst();
    }

    public void print() {
        System.out.println(numbers);
    }
}
