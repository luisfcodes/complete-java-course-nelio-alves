package array_lists.ex1;

public class Negatives {
    private int[] numberList;

    public Negatives(int[] numberList) {
        setNumberList(numberList);
    }

    public void setNumberList(int[] numberList) {
        this.numberList = numberList;
    }

    public void searchNegativeNumbers() {
        for (int number : this.numberList) {
            if(number < 0) {
                System.out.println(number);
            }
        }
    }
}
