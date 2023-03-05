import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();


    public static void main (String[] args) {
        GriffindorStudent harry = generateGriffindorStudent ("Гарри Поттер");
        GriffindorStudent ron = generateGriffindorStudent ("Рон Уизли");
        RavenclawStudent luna = generateRavenclawStudent ("Полумна Лавгуд");
        SlytherinStudent draco = generateSlytherinStudent ("Драко Малфой");
        HufflepuffStudent cedric = generateHufflepuffStudent ("Седрик Диггори");

        harry.print();
        ron.print();
        luna.print();
        draco.print();
        cedric.print();

        harry.compareHogwarts(draco);
        harry.compareHogwarts(ron);
    }

    private static GriffindorStudent generateGriffindorStudent (String name) {
        return new GriffindorStudent(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static HufflepuffStudent generateHufflepuffStudent(String name) {
        return new HufflepuffStudent(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static RavenclawStudent generateRavenclawStudent(String name) {
        return new RavenclawStudent(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
}
