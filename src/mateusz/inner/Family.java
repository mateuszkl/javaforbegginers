package mateusz.inner;

public class Family {

    private final Mother mother;
    private final Father father;

    public Family() {
        this.father = new Father();
        this.mother = new Mother();
    }

    public Mother getMother() {
        return mother;
    }

    public Father getFather() {
        return father;
    }

    public class Father {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public class Mother {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
