package mateusz.collections;

import java.util.ArrayList;
import java.util.List;

public class BasicArrayList {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("ble");
        words.add("Ble1");
        words.add("Ble2");
        words.add("Ble3");
        words.add("Ble4");

        String word = words.get(0);

        System.out.println(word);

        System.out.println("_____________________________");

        words.remove(2);

        for (String wordInLoop : words) {
            System.out.println(wordInLoop);
        }

    }
}
