// Main.java (Class - 4)


// Main.java - Administrator CLI
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add Course");
            System.out.println("2. Add Student");
            System.out.println("3. Enroll Student");
            System.out.println("4. Assign Grade");
            System.out.println("5. Calculate Overall Grade");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Course Code: "); String code = sc.nextLine();
                    System.out.print("Course Name: "); String name = sc.nextLine();
                    System.out.print("Max Capacity: "); int cap = sc.nextInt();
                    CourseManagement.addCourse(code, name, cap);
                    System.out.println("Course added.");
                    break;

                case 2:
                    System.out.print("Student Name: "); String sname = sc.nextLine();
                    System.out.print("Student ID: "); String sid = sc.nextLine();
                    CourseManagement.addStudent(sname, sid);
                    System.out.println("Student added.");
                    break;

                case 3:
                    System.out.print("Student ID: "); sid = sc.nextLine();
                    Student student = CourseManagement.getStudent(sid);
                    if (student == null) { System.out.println("Not found."); break; }
                    System.out.println("Available Courses:");
                    for (Course c : CourseManagement.getCourses())
                        System.out.println(c.getCourseCode() + ": " + c.getCourseName());
                    System.out.print("Enter Course Code: "); code = sc.nextLine();
                    Course course = CourseManagement.getCourses().stream()
                        .filter(c -> c.getCourseCode().equals(code)).findFirst().orElse(null);
                    if (course != null) {
                        CourseManagement.enrollStudent(student, course);
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;

                case 4:
                    System.out.print("Student ID: "); sid = sc.nextLine();
                    student = CourseManagement.getStudent(sid);
                    if (student == null) break;
                    System.out.print("Course Code: "); code = sc.nextLine();
                    course = CourseManagement.getCourses().stream()
                        .filter(c -> c.getCourseCode().equals(code)).findFirst().orElse(null);
                    if (course == null) break;
                    System.out.print("Grade: "); int grade = sc.nextInt();
                    CourseManagement.assignGrade(student, course, grade);
                    break;

                case 5:
                    System.out.print("Student ID: "); sid = sc.nextLine();
                    student = CourseManagement.getStudent(sid);
                    if (student != null) {
                        double avg = CourseManagement.calculateOverallGrade(student);
                        System.out.println("Average Grade: " + avg);
                    }
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
