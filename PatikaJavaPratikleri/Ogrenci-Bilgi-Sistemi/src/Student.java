public class Student {
    String name;
    String studNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double average;
    boolean isPass;


    Student(String name, String studNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.studNo = studNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            course1.grade = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            course2.grade = note2;
            ;
        }
        if (note3 >= 0 && note3 <= 100) {
            course3.grade = note3;
        }

    }

    void isPass() {
        this.average = (this.course1.grade + this.course2.grade + this.course3.grade) / 3.0;
        if (this.average > 55) {
            System.out.println("\n" + this.name + "You successfully passed the class.");
            this.isPass = true;
        } else {
            System.out.println("\n" + this.name + "You have failed the class.");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println("-----------------------------------------------");
        System.out.println(this.course1.name + "Grade: " + this.course1.grade);
        System.out.println(this.course2.name + "Grade: " + this.course2.grade);
        System.out.println(this.course3.name + "Grade: " + this.course3.grade);
        System.out.println("Your average is " + this.average);
    }


}
