package array_lists.ex3;

public class Person {
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void getPersonData(int index) {
        System.out.printf("Dados da %da pessoa:%n", index);
        System.out.printf("Nome: %s%n", this.name);
        System.out.printf("Idade: %d%n", this.age);
        System.out.printf("Altura: %.2f%n", this.height);
    }
}
