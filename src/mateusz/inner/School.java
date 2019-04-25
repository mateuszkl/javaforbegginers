package mateusz.inner;

public class School {

    private String name;
    private String patron;

    public School(String name, String patron) {
        this.name = name;
        this.patron = patron;
    }

    public String getName() {
        return name;
    }

    public Pupil newPupil(String name) {
        return new Pupil(name);
    }

    public class Pupil {

        private String name;

        public Pupil(String name) {
            this.name = name;
        }

        public void introduce() {
            System.out.println("Nazywam się " + name + ". " +
                    "Uczęszczam do szkoły " + School.this.name +
                    " imienia " + patron);
        }

        public String getName() {
            return name;
        }
    }
}
