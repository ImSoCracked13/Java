// 1. (2 marks) Create a ‘Student’ class with attributes such as id, name, course, and grade.
// Then, create a list of N students.
// 2. (4 marks) Implement the following functions:
// o Find students enrolled in a specific course.
// o Count the number of students who achieved each grade (e.g., A, B, C, etc.).
// 3. (4 marks) Implement the following functions:
// o Find the student(s) with the highest grade.
// o List all students whose grade is below the average grade of the class.
// Write in short and concise yet simple code.

// 1a. Create a Student class
public class Student {
    int id;
    String name;
    String course;
    int grade;

    // Constructor to initialize the student object
    public Student(int id, String name, String course, int grade) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
}

