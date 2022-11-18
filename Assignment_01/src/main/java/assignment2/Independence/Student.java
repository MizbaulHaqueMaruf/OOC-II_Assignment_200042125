package assignment2.Independence;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public int id;
    public String name;
    public String dept;
    List<assignment2.DataCoupling.Student> studentList = new ArrayList<>();

    public Student(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }


    void getStudentInfo(int id)
    {
        for (int i=0; i<studentList.size(); i++)
        {
            if(studentList.get(i).id == id){
                System.out.println("Name: " + studentList.get(i).name + ", Dept: " + studentList.get(i).dept);
            }
            else
                System.out.println("Not Found");
        }
    }
}
