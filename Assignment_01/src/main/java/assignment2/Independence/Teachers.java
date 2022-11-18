package assignment2.Independence;

import assignment2.DataCoupling.Student;

import java.util.ArrayList;
import java.util.List;

public class Teachers {
    public int id;
    public String name;
    public String dept;
    List<Student> teacherList = new ArrayList<>();

    public Teachers(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }


    void getStudentInfo(int id)
    {
        for (int i=0; i<teacherList.size(); i++)
        {
            if(teacherList.get(i).id == id){
                System.out.println("Name: " + teacherList.get(i).name + ", Dept: " + teacherList.get(i).dept);
            }
            else
                System.out.println("Not Found");
        }
    }
}
