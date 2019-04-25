package mateusz.enums;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Order {

    private LocalDateTime  orderDateTime;

    private Status status;

    public Order() {
        this.orderDateTime = LocalDateTime.now();
        this.status = Status.NEW;
    }

    public Order(LocalDateTime orderDateTime, Status status) {
        this.orderDateTime = orderDateTime;
        this.status = status;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
