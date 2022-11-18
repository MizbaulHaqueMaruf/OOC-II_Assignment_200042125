package assignment2.ControlCoupling;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public String id;
    public String name;
    public String dept;
    List<Student> studentList = new ArrayList<>();
    IdGenerator idGenerator;

    public Student(String serial, String name, String dept) {
        this.id = idGenerator.generateID(serial, dept);
        this.name = name;
        this.dept = dept;
    }
}
