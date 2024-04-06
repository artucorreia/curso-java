package entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Course {
    private String name;
    private Set<Student> students = new HashSet<>();

    public Course(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
