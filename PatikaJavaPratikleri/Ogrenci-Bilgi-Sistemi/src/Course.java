public class Course {
    String name;
    String code;
    String prefix;
    int grade;
    Teacher teacher;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = null;
        int note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
        } else {
            System.out.println("The branches do not match.");
        }

    }

    void printTeacherInfo() {
        this.teacher.print();
    }

}
