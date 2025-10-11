public class App {
    public static void main(String[] args) throws Exception {
        // 1b. Create a list of N students.
        Student[] students = new Student[4];
        students[0] = new Student(1, "Hi", "CS", 90);
        students[1] = new Student(2, "Hello", "BM", 80);
        students[2] = new Student(3, "Yo", "GD", 90);
        students[3] = new Student(4, "Hey", "MKT", 80);

        int N = students.length;

        // 2a. Find students enrolled in a specific course.
        String courseToFind = "CS";
        System.out.print("Students enrolled in " + courseToFind + ": ");
        for (int i = 0; i < N; i++) {
            if (students[i].course == courseToFind) {
                System.out.println(students[i].name + " ");
            }
        }

        // 2b. Count the number of students who achieved each grade (e.g., A, B, C, etc.).
        int gradeToCount = 80;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (students[i].grade == gradeToCount) {
                count++;
            }
        }
        System.out.println("Number of students who achieved " + gradeToCount + ": " + count);

        // 3a. Find the student(s) with the highest grade.
        int highestGrade = 90;
        System.out.println("Student(s) with the highest grade: ");
        for (int i = 0; i < N; i++) {
            if (students[i].grade == highestGrade) {
                System.out.println(students[i].name);
            }
        }

        // 3b. List all students whose grade is below the average grade of the class.
        int averageGrade = 0;
        for (int i = 0; i < N; i++) {
            averageGrade += students[i].grade;
        }
        averageGrade /= N;
        System.out.println("Average grade: " + averageGrade);
        System.out.println("Students with grade below average: ");
        for (int i = 0; i < N; i++) {
            if (students[i].grade < averageGrade) {
                System.out.println(students[i].name + " ");
            }
        }   
    }
}
