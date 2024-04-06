package entities;

import java.util.Objects;

public class Student {
    private Integer code;

    public Student(Integer code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(code, student.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("code=").append(code);
        sb.append('}');
        return sb.toString();
    }
}
