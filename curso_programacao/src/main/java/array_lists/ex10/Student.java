package array_lists.ex10;

public class Student {
    private final String name;
    private final double grade1;
    private final double grade2;

    public Student(String name, double grade1, double grade2) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return (grade1 + grade2) / 2;
    }

    public boolean isApproved() {
        double PASS_GRADE = 6.0;
        return getAverage() >= PASS_GRADE;
    }

}
