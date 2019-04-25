package mateusz.inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {

    public static void main(String[] args) {

        File file = new File("numbers.txt");
//
//        Scanner scanner = new Scanner(file);
//
//        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextInt());
//        }

        try {

            Scanner scanner1 = new Scanner(file);

            List<Integer> integers = new ArrayList<>();

            while (scanner1.hasNextLine()) {
                integers.add(scanner1.nextInt());
            }

            System.out.println("size: " + integers.size());
            System.out.println("sum: " + sum(integers));

            scanner1.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error. message: " + e.getMessage());
        }

        try {
            File file1 = new File("names.txt");

            Scanner scanner = new Scanner(file1);

            List<String> names = new ArrayList<>();

            while (scanner.hasNextLine()) {
                names.add(scanner.next());
            }

            System.out.println(names.size());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Integer sum(List<Integer> integers) {
        int sum = 0;

        for (int i : integers) {
            sum += i;
        }

        return sum;
    }

}
