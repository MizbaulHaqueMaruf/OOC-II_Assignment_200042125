package assignment2.DataCoupling;

public class main {
    public static void main(String args[])
    {
        Student student = new Student(11,"Maruf","CSE");
        student.studentList.add(student);

        student.getStudentInfo(11);
    }
}