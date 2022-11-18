package assignment2.ContentCoupling;

public class Admin {
    void changeDepartmentToCSE(int id)
    {
        Student student = null;
        for(int i=0; i<student.studentList.size(); i++)
        {
            if(student.studentList.get(i).id == id)
            {
                student.studentList.get(i).dept = "CSE";
            }
            else
            {
                System.out.println("Not Found");
            }
        }
    }
}
