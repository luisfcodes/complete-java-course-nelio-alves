package array_lists.ex9;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getPersonData(int index) {
        System.out.printf("Dados da %da pessoa:%n", index);
        System.out.printf("Nome: %s%n", this.name);
        System.out.printf("Idade: %d%n", this.age);
    }
}
