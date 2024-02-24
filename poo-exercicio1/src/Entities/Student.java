package Entities;

public class Student {
    public String name;
    public double firstGrade;

    public double secondGrade;

    public double thirdGrade;

    public double finalGrade() {
        return firstGrade + secondGrade + thirdGrade;
    }

    public double missingPoints() {
        if(finalGrade() < 60) {
            return 60 - finalGrade();
        }
        return 0.0;
    }
    public String toString() {
        if(missingPoints() == 0.0) {
            return "FINAL GRADE = " +
                    String.format("%.2f", finalGrade()) +
                    "\nPASS";
        }
        return "FINAL GRADE = " +
                String.format("%.2f", finalGrade()) +
                "\nFAILED" +
                "\nMISSING " +
                String.format("%.2f", missingPoints()) +
                " POINTS";
    }
}
