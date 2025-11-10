// Course.java (Class - 2) 


// Course.java - handles course info and static tracking
public class Course {

    private String courseCode, courseName;
    private int maxCapacity, enrolledCount = 0;
    private static int totalEnrolled = 0; // shared across all courses (Schildt, 2018)

    public Course(String code, String name, int capacity) {
        courseCode = code;
        courseName = name;
        maxCapacity = capacity;
    }

    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public int getMaxCapacity() { return maxCapacity; }

    public boolean enrollStudent() {
        if (enrolledCount < maxCapacity) {
            enrolledCount++;
            totalEnrolled++;
            return true;
        }
        return false;
    }

    public static int getTotalEnrolledStudents() {
        return totalEnrolled; // shared state tracking (Bloch, 2018)
    }
}
