/*
Ryan Chien
Period 4
Class Design
Student
 */

public class Student {
    // initiate variables
    private String name;
    private double gpa;
    private String year;
    private int units;

    // zero-argument constructor
    public Student() {
        name = "Bob Ross";
        gpa = 4.0;
        year = "Sophomore";
        units = 60;
    }

    // multi-argument contructor
    public Student(String name, double gpa, String year, int units) {
        this.name = name;
        this.gpa = gpa;
        this.year = year;
        this.units = units;
    }

    // setter setGpa
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // setter setUnits
    public void setUnits(int units) {
        this.units = units;
    }

    // getter getGraduate
    public String getGraduate() {
        int required = 0;
        boolean graduate;
        String graduateText;
        if (this.year == "sophomore") {
            required = 60;
        }
        else if (this.year == "junior") {
            required = 120;
        }
        else if (this.year == "senior") {
            required = 180;
        }
        graduate = this.units >= required;
        if (graduate) {
            graduateText = String.format("%s is on track to graduate with a %s GPA and %s units completed", name, gpa, units);
        }
        else {
            graduateText = String.format("%s is not on track to graduate", name);
        }
        return graduateText;
    }

    // toString method
    public String toString() {
        String output;
        output = String.format("Student: %s\nGPA: %s\nClass: %s\nUnits Completed: %s", name, gpa, year, units);
        return output;
    }
}
