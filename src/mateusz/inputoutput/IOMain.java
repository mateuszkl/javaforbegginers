package mateusz.inputoutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOMain {

    public static void main(String[] args) throws IOException {

        print();

        dsad();
    }

    static void print() {
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
    }

    public static void dsad() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("kasztan.txt"))) {

            for (int i = 0; i < 11; i++) {
                writer.write(String.valueOf(i));
                writer.flush();
            }

        }
    }


}
