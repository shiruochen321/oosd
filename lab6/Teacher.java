
public class Teacher extends Person{
    private int numCourses = 0;
    private String[] courses = new String[10]; // Assume a maximum of 10 courses

    public Teacher(String name, String address) {
        super(name, address);
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }

    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false; // Course already exists
            }
        }
        if (numCourses < courses.length) {
            courses[numCourses] = course;
            numCourses++;
            System.out.println(course + " added.");
            return true;
        }
        return false; // Array is full
    }

    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                // Remove the course (move the last element to the current position)
                courses[i] = courses[numCourses - 1];
                numCourses--;
                System.out.println(course + " removed.");
                return true;
            }
        }
        return false; // Course does not exist
    }

}
