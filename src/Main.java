import Enums.Gender;
import db.Database;
import model.Student;
import service.impl.StudentImpl;

import java.security.interfaces.DSAKey;

public class Main {
    public static void main(String[] args) {
        Student student1 =new Student(1,"Temirlan",20, Gender.MALE);
        Student  student2=new Student(2,"Ernaz",19,Gender.MALE);


        StudentImpl student=new StudentImpl();
        System.out.println(student.addStudent(student1));
        student.addStudent(student2);
        System.out.println(student.getAllStudents());
        System.out.println(student.getStudentById(2));
        System.out.println(student.updateStudentFullName(2,"mirlan"));
        System.out.println(student.filterByGender());
        student.deleteStudentById(2);


    }
}