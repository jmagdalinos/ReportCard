package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * ReportCard stores six numeric values, all from 1 to 10 which represent the grades in the
 * following subjects: Maths, History, Chemistry, Physics, Literature & Latin
 * These values are then used to calculate the final grade which results from the average of all
 * the subjects.
 */

public class ReportCard {

    /** ArrayList storing values */
    private ArrayList<Double> mGrades = new ArrayList<Double>();

    /** ArrayList storing subjects */
    private ArrayList<String> mSubjects = new ArrayList<String>();

    /** Final grade */
    private double mFinalGrade;

    /** String with all grades */
    private String allGrades;

    /**
     * Create a new ReportCard object.
     *
     * @param mathsGrade is the grade for Maths
     * @param historyGrade is the grade for History
     * @param chemistryGrade is the grade for Chemistry
     * @param physicsGrade is the grade for Physics
     * @param literatureGrade is the grade for Literature
     * @param latinGrade is the grade for Latin
     */

    public ReportCard(double mathsGrade, double historyGrade, double chemistryGrade, double
            physicsGrade, double literatureGrade, double latinGrade) {

        mSubjects.add(0, "Maths");
        mSubjects.add(1, "History");
        mSubjects.add(2, "Chemistry");
        mSubjects.add(3, "Physics");
        mSubjects.add(4, "Literature");
        mSubjects.add(5, "Latin");

        mGrades.add(0, mathsGrade);
        mGrades.add(1, historyGrade);
        mGrades.add(2, chemistryGrade);
        mGrades.add(3, physicsGrade);
        mGrades.add(4, literatureGrade);
        mGrades.add(5, latinGrade);
    }


    /** Set the grade for Maths */
    public void setmMathsGrade(double grade) {
        mGrades.set(0, grade);
    }

    /** Set the grade for History */
    public void setmHistoryGrade(double grade) {
        mGrades.set(1, grade);
    }

    /** Set the grade for Chemistry */
    public void setmChemistryGrade(double grade) {
        mGrades.set(2, grade);
    }

    /** Set the grade for Physics */
    public void setmPhysicsGrade(double grade) {
        mGrades.set(3, grade);
    }

    /** Set the grade for Literature */
    public void setmLiteratureGrade(double grade) {
        mGrades.set(4, grade);
    }

    /** Set the grade for Latin */
    public void setmLatinGrade(double grade) {
        mGrades.set(5, grade);
    }

    /** Get the grade for Maths */
    public double getmMathsGrade() {
        double grade = mGrades.get(0);
        return grade;
    }

    /** Get the grade for History */
    public double getmHistoryGrade() {
        double grade = mGrades.get(1);
        return grade;
    }

    /** Get the grade for Chemistry */
    public double getmChemistryGrade() {
        double grade = mGrades.get(2);
        return grade;
    }

    /** Get the grade for Physics */
    public double getmPhysicsGrade() {
        double grade = mGrades.get(3);
        return grade;
    }

    /** Get the grade for Literature */
    public double getmLiteratureGrade() {
        double grade = mGrades.get(4);
        return grade;
    }

    /** Get the grade for Latin */
    public double getmLatinGrade() {
        double grade = mGrades.get(5);
        return grade;
    }

    /** Get the final grade by calculating it */
    public double getmFinalGrade() {
        mFinalGrade = 0.0;
        for (int i = 0; i < mGrades.size(); i++){
            double grade = mGrades.get(i);
            mFinalGrade = mFinalGrade + grade;
        }
        mFinalGrade = mFinalGrade / mGrades.size();
        return mFinalGrade;
    }

    @Override
    public String toString() {
        allGrades = "";
        for (int i = 0; i<mGrades.size(); i++){
            Double grade = mGrades.get(i);
            String subject = mSubjects.get(i);
            allGrades = allGrades + subject + ": " + grade + "\n";
        }
        allGrades = allGrades + "Final Grade: " + mFinalGrade;
        return allGrades;
    }
}
