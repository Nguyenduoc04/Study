package lession9;

public class Student {
    private int mathScore;
    private int physicsScore;
    private int chemistryScore;

    public double calculateGPA() {
        int totalScore = mathScore + physicsScore + chemistryScore;
        double averageScore = totalScore / 3.0;
        return averageScore;
    }

    public boolean isPassed() {
        double averageScore = calculateGPA();
        return averageScore >= 5.0;
    }
}