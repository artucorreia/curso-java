import entities.Course;
import entities.Professor;
import entities.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Professor professor = new Professor("Alex");
        Course a = new Course("A");
        Course b = new Course("B");
        Course c = new Course("C");
        professor.addCourse(a);
        professor.addCourse(b);
        professor.addCourse(c);

        for (Course course : professor.getCourses()) {
            System.out.printf("how many students for course %s? ", course.getName());
            int aux = scan.nextInt();
            for (int i = 0; i < aux; i++) {
                int studentCode = scan.nextInt();
                course.addStudent(new Student(studentCode));
            }
        }

        System.out.println(professor.getTotalStudents());
        scan.close();
    }
}