package mateusz.collections;

public class Student {
    private Long indexNumber;
    private String name;
    private String surname;

    public Student(Long indexNumber, String name, String surname) {
        this.indexNumber = indexNumber;
        this.name = name;
        this.surname = surname;
    }

    public Long getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(Long indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
