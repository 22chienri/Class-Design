/*
Ryan Chien
Period 4
Class Design
StudentDriver
 */

public class StudentDriver {
    public static void main(String[] args) {
        // create student objects
        Student sophomoreStudent = new Student();
        Student seniorStudent = new Student("Billy Bob", 0.2, "senior", 49);

        // print both students
        System.out.println(sophomoreStudent);
        System.out.println(sophomoreStudent.getGraduate());
        System.out.println();
        System.out.println(seniorStudent);
        System.out.println(seniorStudent.getGraduate());

        // change senior gpa and units
        seniorStudent.setGpa(3.8);
        seniorStudent.setUnits(190);

        // print senior new graduation status
        System.out.println(seniorStudent.getGraduate());
    }
}
