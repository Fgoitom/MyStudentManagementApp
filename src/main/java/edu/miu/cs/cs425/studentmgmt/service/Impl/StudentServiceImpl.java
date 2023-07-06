package edu.miu.cs.cs425.studentmgmt.service.Impl;


import edu.miu.cs.cs425.studentmgmt.model.Student;
import edu.miu.cs.cs425.studentmgmt.repositories.StudentRepository;
import edu.miu.cs.cs425.studentmgmt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentRepository studentRepository;


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student addNewStudent(Student newStudent) {
        return studentRepository.save(newStudent);
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    @Override
    public Student updateStudent(Student updatedStudent, Long studentId) {
        return studentRepository.findById(studentId)
                .map(student -> {
                    student.setStudentNumber(updatedStudent.getStudentNumber());
                    student.setFirstName(updatedStudent.getFirstName());
                    student.setMiddleName(updatedStudent.getMiddleName());
                    student.setLastName(updatedStudent.getLastName());
                    student.setCgpa(updatedStudent.getCgpa());
                    return studentRepository.save(student);
                })
                .orElseGet(() -> studentRepository.save(updatedStudent));
    }

    @Override
    public void deleteStudentById(Long studentId) {
        studentRepository.deleteById(studentId);

    }


}
