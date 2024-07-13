package array_lists.ex2;

import java.util.Arrays;

public class Sum_Vector {
    private double[] numberList;

    public Sum_Vector(double[] numberList) {
        setNumberList(numberList);
    }

    public void setNumberList(double[] numberList) {
        this.numberList = numberList;
    }

    public void showAllNumbers() {
        System.out.print("VALORES = ");
        Arrays.stream(this.numberList).forEach(number -> System.out.printf("%.2f ", number));
        System.out.println();
    }

    public void showSumAllNumbers() {
        System.out.printf("SOMA = %.2f%n", sumAllNumbers());
    }

    public void showAverageAllNumbers() {
        System.out.printf("MEDIA = %.2f%n", averageAllNumbers());
    }

    public double sumAllNumbers() {
        double sum = 0;
        for (double number : this.numberList) {
            sum += number;
        }
        return sum;
    }

    public double averageAllNumbers() {
        return sumAllNumbers() / this.numberList.length;
    }
}
