package mateusz.collections;

import java.util.ArrayList;
import java.util.List;

public class FirstListExercise {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(10);
        numbers.add(3);
        numbers.add(1);
        numbers.add(9);

        Integer result = FirstListExercise.sum(numbers);

        System.out.println("Sum: " + result);
        System.out.println("Product: " + FirstListExercise.product(numbers));
    }

    private static Integer sum(List<Integer> numbers) {
        Integer memory = 0;

        for (Integer i : numbers) {
            memory += i;
        }

        return memory;
    }

    private static Integer product(List<Integer> numbers) {
        Integer memory = 1;

        for (Integer i : numbers) {
            memory *= i;
        }

        return memory;
    }

    private static Integer mean(List<Integer> numbers) {
        return sum(numbers) / numbers.size();
    }

}
