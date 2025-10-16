
public class Student extends Person{
    private int numCourses = 0;
    private String[] courses = new String[10]; // Assume a maximum of 10 courses
    private int[] grades = new int[10];

    public Student(String name, String address) {
        super(name, address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Student: " + super.toString());
        for (int i = 0; i < numCourses; i++) {
            sb.append(" ").append(courses[i]).append(":").append(grades[i]);
        }
        return sb.toString();
    }

    public void addCourseGrade(String course, int grade) {
        if (numCourses < courses.length) {
            courses[numCourses] = course;
            grades[numCourses] = grade;
            numCourses++;
        }
    }

    public void printGrades() {
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }

    public double getAverageGrade() {
        if (numCourses == 0) return 0;
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (double) sum / numCourses;
    }

}
