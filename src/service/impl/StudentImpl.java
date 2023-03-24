package service.impl;

import Enums.Gender;
import db.Database;
import model.Group;
import model.Student;
import service.StudentAble;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentImpl implements StudentAble {
    Database database = new Database();

    @Override
    public String addStudent(Student student) {
        database.getStudents().add(student);
        return "Successfully saved";
    }


    @Override
    public String getStudentById(int id) {
        for (Student s : database.getStudents()) {
            if (s.getId() == id) {
                System.out.println(s);
            }
        }
        return "find student";
    }


    @Override
    public List<Student> getAllStudents() {
        return database.getStudents().stream().toList();

    }

    @Override
    public String updateStudentFullName(int id, String fullName) {
        for (Student s : database.getStudents()) {
            if (s.getId() == id) {
                s.setFullName(fullName);
                database.getStudents().forEach(System.out::println);
                return "update name";
            }
        }
        return "no";
    }

    @Override
    public List<Student> filterByGender() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input num");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                database.getStudents().stream().filter(p -> p.getGender().equals(Gender.MALE))
                        .forEach(System.out::println);
                return database.getStudents();

            case 2:
                database.getStudents().stream().filter(p -> p.getGender().equals(Gender.FEMALE))
                        .forEach(System.out::println);
                return database.getStudents();

        }
        return null;
}


    @Override
    public void deleteStudentById(int id) {
        for (Student s:database.getStudents()) {
         if(id==s.getId()){
             database.getStudents().remove(s);
             System.out.println(database);
         }
        }

    }
}
