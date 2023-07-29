public class Main {
    public static void main(String[] args) {

        Teacher mahmut = new Teacher("Mahmut", "03232342234", "HIS");
        Teacher sena = new Teacher("Sena", "02423234323", "MATH");
        Teacher songul = new Teacher("Songul", "02431234323", "PHY");


        Course history = new Course("History", "102", "HIS");
        history.addTeacher(sena);
        history.addTeacher(mahmut);

        Course physics = new Course("Physics", "101", "PHY");
        physics.addTeacher(songul);

        Course math = new Course("Math", "103", "MATH");
        math.addTeacher(sena);

        Student st1 = new Student("Geek Saban", "1343", "3", math, physics, history);
        st1.addBulkExamNote(35, 230, 55);
        st1.isPass();

        Student st2 = new Student("Stubby Necmi", "1123", "3", math, physics, history);
        st2.addBulkExamNote(75, 90, 85);
        st2.isPass();


    }
}