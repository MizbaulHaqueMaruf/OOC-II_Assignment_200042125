package assignment2.StampCoupling;

public class main {
    public static void main(String args[])
    {
        Student student = new Student(12,"Mizba", "EEE");
        student.studentList.add(student);

        Printer printer = new Printer();
        printer.printStudentName(12, student.studentList);
    }
}
