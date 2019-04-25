package mateusz.inner;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School("2lo", "ble");

        School.Pupil pupil1 = school.new Pupil("pupil1");
        School.Pupil pupil2 = school.newPupil("pupil2");

    }
}
