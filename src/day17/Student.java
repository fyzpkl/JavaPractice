package day17;

public class Student {
    int age;
    String name;
    String major;

    public Student(int age, String name, String major) {
        this.age = age;
        this.name = name;
        this.major = major;
    }

    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
