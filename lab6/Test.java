import java.io.IOException;

public class Test {
     public static void main(String[] args) {
        Student student = new Student("John Doe", "1 FairyLand Ave");
        student.addCourseGrade("H2215", 92);
        student.addCourseGrade("H2202", 68);
        System.out.println(student);
        System.out.println("Average grade is " + student.getAverageGrade());

        Teacher teacher = new Teacher("Oisin Cavley", "8 Yellow Brick Road");
        System.out.println(teacher);
        teacher.addCourse("H2215");
        teacher.addCourse("H2202");
        teacher.removeCourse("H2215");
        teacher.removeCourse("H2202");

        System.out.print("Press any key to continue...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
