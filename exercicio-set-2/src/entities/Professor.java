package entities;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Professor {
    private String name;
    private Set<Course> courses = new LinkedHashSet<>();

    public Professor(String name) {
        this.name = name;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public int getTotalStudents() {
        Set<Student> allStudents = new HashSet<>();
        for (Course course : courses) {
            allStudents.addAll(course.getStudents());
        }
        return allStudents.size();
    }
}
