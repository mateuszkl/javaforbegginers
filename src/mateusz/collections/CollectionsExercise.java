package mateusz.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsExercise {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);


        System.out.println(doesContainDuplicates(numbers));
    }

    private static Integer sum(List<Integer> numbers) {
        Integer memory = 0;

        for (Integer number : numbers) {
            memory += number;
        }

        return memory;
    }

    private static Integer mean(List<Integer> numbers) {
        Integer sum = sum(numbers);

        return sum / numbers.size();
    }

    private static boolean doesContainDuplicates(List<Integer> numbers) {
        Set<Integer> integerSet = new HashSet<>();

        for (Integer number : numbers) {
            integerSet.add(number);
        }

        return integerSet.size() != numbers.size();
    }

}
