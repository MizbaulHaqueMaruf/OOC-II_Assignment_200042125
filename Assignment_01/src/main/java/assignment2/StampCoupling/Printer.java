package assignment2.StampCoupling;

import java.util.List;

public class Printer {

    void printStudentName(int id, List<Student> list)
    {
        for (int i=0; i<list.size(); i++)
        {
            if(list.get(i).id == id){
                System.out.println("Name: " + list.get(i).name);
            }
            else
                System.out.println("Not Found");
        }
    }
}
