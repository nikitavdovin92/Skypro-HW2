public class RavenclawStudent extends HogwartsStudent {
    private int cleverness;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudent(String name, int magic, int transgression, int cleverness, int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int ability() {
        return cleverness+wisdom+wit+creativity;
    }

    public void compareRavenclaw (RavenclawStudent ravenclawStudent) {
        int ability1 = ability();
        int ability2 = ravenclawStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент из Когтеврана %s лучше, чем студент из Когтеврана %s: %d VS %d%n",
                    getName(), ravenclawStudent.getName(), ability1, ability2);

        } else if (ability2 > ability1) {
            System.out.printf("Студент из Когтеврана %s лучше, чем студент из Когтеврана %s: %d VS %d%n",
                    getName(), ravenclawStudent.getName(), ability1, ability2 );

        } else {
            System.out.printf("Студент из Когтеврана %s такой же, как студент из Когтеврана %s: %d VS %d%n",
                    getName(), ravenclawStudent.getName(), ability1, ability2);

        }

    }

    @Override
    public String toString() {
        return String.format("%s; ум: %d; мудрость: %d; сообразительность: %d, творчество: %d",
                super.toString(), cleverness, wisdom, wit, creativity);
    }


}
