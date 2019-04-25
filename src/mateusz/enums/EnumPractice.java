package mateusz.enums;

import java.time.LocalDateTime;

public class EnumPractice {

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(2019, 1, 1, 10, 0);

        Order newOrder = new Order(date, Status.NEW);


    }
}
