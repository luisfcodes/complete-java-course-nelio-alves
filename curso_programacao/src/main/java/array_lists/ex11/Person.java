package array_lists.ex11;

public class Person {
    private final char gender;
    private final double height;

    public Person(char gender, double height) {
        this.gender = gender;
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public char getGender() {
        return this.gender;
    }

    public void getPersonData(int index) {
        System.out.printf("Altura da %da pessoa: %.2f%n", index, this.height);
        System.out.printf("Gênero da %da pessoa: %s%n", index, this.gender);
    }
}
