public class HufflenpuffStudent extends {
    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflenpuffStudent(int diligence, int loyalty, int honesty) {
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int ability() {
        return diligence + loyalty + honesty;
    }

    public void compareHufflenpuff (HufflenpuffStudent hufflenpuffStudent) {
        int ability1 = ability();
        int ability2 = hufflenpuffStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент из Гриффиндора %s лучше, чем студент из Гриффиндора %s: %d VS %d%n",
                    getName(), hufflenpuffStudent.getName(), ability1, ability2);

        } else if (ability2 > ability1) {
            System.out.printf("Студент из Гриффиндора %s лучше, чем студент из Гриффиндора %s: %d VS %d%n",
                    getName(), hufflenpuffStudent.getName(), ability1, ability2 );

        } else {
            System.out.printf("Студент из Гриффиндора %s такой же, как студент из Гриффиндора %s: %d VS %d%n",
                    getName(), hufflenpuffStudent.getName(), ability1, ability2);

        }

    }
}
