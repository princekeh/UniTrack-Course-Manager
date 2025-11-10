// CourseManagement.java (Class - 3)


// CourseManagement.java - handles central management using static methods
import java.util.*;

public class CourseManagement {

    private static List<Course> courses = new ArrayList<>();
    private static Map<String, Student> studentRecords = new HashMap<>();

    public static void addCourse(String code, String name, int capacity) {
        courses.add(new Course(code, name, capacity));
    }

    public static List<Course> getCourses() { return courses; }

    public static void enrollStudent(Student student, Course course) {
        student.enrollInCourse(course);
    }

    public static void assignGrade(Student student, Course course, int grade) {
        student.assignGrade(course, grade);
    }

    public static double calculateOverallGrade(Student student) {
        Map<String, Integer> grades = student.getGrades();
        if (grades.isEmpty()) return 0;
        int total = 0;
        for (int g : grades.values()) total += g;
        return (double) total / grades.size(); // simple average
    }

    public static void addStudent(String name, String id) {
        studentRecords.put(id, new Student(name, id));
    }

    public static Student getStudent(String id) {
        return studentRecords.get(id);
    }
}
