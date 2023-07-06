package edu.miu.cs.cs425.studentmgmt.controller;

import edu.miu.cs.cs425.studentmgmt.model.Student;
import edu.miu.cs.cs425.studentmgmt.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/eregistrar/api/student")
@RequiredArgsConstructor
public class StudentController {


    private final StudentService studentService;

    @GetMapping(value = "/list")
    public ResponseEntity<List<Student>> listStudents(){
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @PostMapping(value = "/register")
    public ResponseEntity<Student> registerStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.OK);
    }
    @GetMapping (value = "/get/{id}")
    public ResponseEntity<Student> StudentById(@PathVariable("id") Long id, Student student)  {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }
    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Student> updateStudent(@Valid @RequestBody  Student student, @PathVariable("id") Long id){
        return new ResponseEntity<>( studentService.updateStudent(student, id), HttpStatus.OK);
    }
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudentById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}

