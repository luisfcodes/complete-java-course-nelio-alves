package oo.ex3;

public class Student {
    public String name;
    public double firstQuarterGrade;
    public double secondQuarterNote;
    public double thirdQuarterNote;

    private double calcFinalGrade(){
        return  firstQuarterGrade + secondQuarterNote + thirdQuarterNote;
    }

    public void getFinalGrade() {
        System.out.printf("FINAL GRADE = %.2f\n", calcFinalGrade());
    }

    public void getApprovalResult() {
        if (calcFinalGrade() < 60) {
            double minimumGradeToBeApproved = 60.00;
            double missingPoints = minimumGradeToBeApproved - calcFinalGrade();

            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", missingPoints);
        } else {
            System.out.println("PASS");
        }
    }
}
