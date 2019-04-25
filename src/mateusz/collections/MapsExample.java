package mateusz.collections;

import mateusz.inheritance.animals.Beaver;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class MapsExample {

    public static void main(String[] args) {
        Map<Integer, String> exampleMap = new HashMap<>();


        exampleMap.put(1, "Mateusz");
        exampleMap.put(2, "Michal");
        exampleMap.put(3, "Milena");
        exampleMap.put(null, "zadzaiała?");
        exampleMap.put(null, "serio?");

        String name = exampleMap.get(2);
        String nonExistentName = exampleMap.get(4);
        String nulll = exampleMap.get(null);

        System.out.println(name);
        System.out.println(nulll);
        System.out.println(nonExistentName);

        System.out.println(exampleMap.entrySet());

        System.out.println(exampleMap.keySet());

        System.out.println(exampleMap.containsValue("Milena"));
        System.out.println(exampleMap.containsKey(41));
        System.out.println(exampleMap.isEmpty());

        Map<Long, Student> students = new HashMap<>();
        students.put(123L, new Student(123L, "Michal", "Kryszczak"));
        students.put(999L, new Student(999L, "Milena", "Mankowska"));

        Student michal = students.get(123L);

        System.out.println(michal.getName() + michal.getSurname());

        System.out.println(students.get(124L));
        System.out.println(students.get(999L));


        Map<Integer, Beaver> beaverMap = new HashMap<>();
        beaverMap.put(1, new Beaver(1, "name"));
        Beaver beaver = beaverMap.get(1);

        Character c = 'v';

    }
}
