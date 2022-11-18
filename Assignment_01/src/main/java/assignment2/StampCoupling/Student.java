package assignment2.StampCoupling;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int id;
    String name;
    String dept;

    List<Student> studentList = new ArrayList<>();

    public Student(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
}
