# UniTrack-Course-Manager

👨‍💻 About the Project

This project is a solid, clean implementation of a student and course management system, specifically designed to showcase intermediate Java OOP skills. It’s a step up from basic data structures, heavily relying on proper encapsulation, class relationships, and Java's powerful Map and List collections to model a university environment. This is a robust framework for managing enrollment, grades, and student performance.


🌟 Advanced Features
 * Encapsulated Data Model: Dedicated Student and Course classes ensure data integrity (private fields with public getters/setters). 
 * Course Capacity Control: The Course object manages its own enrollment count, preventing over-enrollment.
 * Grade Tracking: Grades are stored efficiently using a HashMap<String, Integer> within the Student class, mapping a course code (String) to a grade (Integer).
 * Centralized Logic: A static CourseManagement class handles global operations (registering new users, finding courses, calculating averages), acting as a service layer.
 * Overall Grade Calculation: Calculates a student's average grade across all completed courses.


🛠️ Installation & Setup: 
To run this complex management system, you'll need all the classes compiled and ready.


🚨 Prerequisites: 
Ensure you have the Java Development Kit (JDK) installed.


🧠 Code Highlights: 
The real sophistication lies in the CourseManagement class's ability to seamlessly manage the relationships. The use of HashMap to store grades, keyed by the course code, means lookups and updates are fast and easy. It’s a great example of using the right data structure for the job to build a scalable, object-oriented model.