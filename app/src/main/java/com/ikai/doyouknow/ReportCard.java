package com.ikai.doyouknow;

public class ReportCard {

    // Declaring student name as final so that it wont be modified.
    public static final String studentName = "Sonu";

    // Declaring variables for report card.
    private int physicsGrade;
    private int chemistryGrade;
    private int mathsGrade;
    private int englishGrade;
    private int hindiGrade;
    private double totalGrade;


    // Constructor with no arguments.
    public ReportCard() {
    }

    // Constructor with argemnts.
    public ReportCard(int physicsGrade, int chemistryGrade, int mathsGrade
            , int englishGrade, int hindiGrade) {
        this.physicsGrade = physicsGrade;
        this.chemistryGrade = chemistryGrade;
        this.mathsGrade = mathsGrade;
        this.englishGrade = englishGrade;
        this.hindiGrade = hindiGrade;
        totalGrade = (physicsGrade + chemistryGrade + mathsGrade + englishGrade + hindiGrade) / 5.0;
    }

    // Getters and Setters.
    public int getPhysicsGrade() {
        return physicsGrade;
    }

    public void setPhysicsGrade(int physicsGrade) {
        this.physicsGrade = physicsGrade;
    }

    public int getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(int chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
    }

    public int getMathsGrade() {
        return mathsGrade;
    }

    public void setMathsGrade(int mathsGrade) {
        this.mathsGrade = mathsGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }

    public int getHindiGrade() {
        return hindiGrade;
    }

    public void setHindiGrade(int hindiGrade) {
        this.hindiGrade = hindiGrade;
    }

    // toString method.
    @Override
    public String toString() {
        return "Name: " + studentName +
                ", Physics Grade: " + physicsGrade +
                ", Chemistry Grade: " + chemistryGrade +
                ", Mathematics Grade: " + mathsGrade +
                ", English Grade: " + englishGrade +
                ", Hindi Grade: " + hindiGrade +
                ", Overall grade: " + totalGrade;
    }
}
