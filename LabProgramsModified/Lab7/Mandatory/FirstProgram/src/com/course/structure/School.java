package com.course.structure;

public class School extends Building {
    private int numberOfClassrooms;
    private String gradeLevel;

    public School(int squareFootage, int stories, int numberOfClassrooms, String gradeLevel) {
        super(squareFootage, stories);
        this.numberOfClassrooms = numberOfClassrooms;
        this.gradeLevel = gradeLevel;
    }

    public int getNumberOfClassrooms() {
        return numberOfClassrooms;
    }

    public void setNumberOfClassrooms(int numberOfClassrooms) {
        this.numberOfClassrooms = numberOfClassrooms;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}
