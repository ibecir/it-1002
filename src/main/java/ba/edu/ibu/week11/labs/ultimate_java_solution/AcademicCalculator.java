package ba.edu.ibu.week11.labs.ultimate_java_solution;

public class AcademicCalculator {

    public int addBonus(int grade, int bonus) {
        return grade + bonus;
    }

    public double calculatePercentage(int points, int maxPoints) {
        return ((double) points / maxPoints) * 100;
    }

    public boolean isPassing(int grade) {
        return grade >= 55;
    }

    public int maxGrade(int a, int b) {
        return Math.max(a, b);
    }

    public int divide(int a, int b) {
        return a / b;
    }
}