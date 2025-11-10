// CourseEnrollmentSystem (Project Name)
// Student.java (Class - 1) 


// Student.java - stores and manages student data
import java.util.*;

public class Student {

    private String name, id; // private instance variables for encapsulation (Oracle, 2023)
    private List<Course> enrolledCourses = new ArrayList<>();
    private Map<String, Integer> grades = new HashMap<>();

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public void enrollInCourse(Course course) {
        if (course.enrollStudent()) {
            enrolledCourses.add(course); // modifying object state (Eck, 2019)
        } else {
            System.out.println("Course full.");
        }
    }

    public void assignGrade(Course course, int grade) {
        if (enrolledCourses.contains(course)) {
            grades.put(course.getCourseCode(), grade);
        } else {
            System.out.println("Student not enrolled in course.");
        }
    }

    public Map<String, Integer> getGrades() { return grades; }

    public List<Course> getEnrolledCourses() { return enrolledCourses; }
}
