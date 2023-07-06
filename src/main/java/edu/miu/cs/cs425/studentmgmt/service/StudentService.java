package edu.miu.cs.cs425.studentmgmt.service;


import edu.miu.cs.cs425.studentmgmt.model.Student;

import java.util.List;


public interface StudentService {

    public abstract Student saveStudent(Student student);
    public abstract List<Student> getAllStudents();
    public abstract Student addNewStudent(Student newStudent);
    public abstract Student getStudentById(Long studentId);
   public abstract Student updateStudent(Student updatedStudent, Long studentId);
    public abstract void deleteStudentById(Long studentId);
}
