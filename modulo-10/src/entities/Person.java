package entities;

public class Person {
    double height;
    char gender;

    public Person(double height, char gender) {
        this.height = height;
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "" + height;
    }
}
