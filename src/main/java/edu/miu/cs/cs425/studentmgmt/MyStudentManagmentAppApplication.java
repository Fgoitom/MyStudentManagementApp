package edu.miu.cs.cs425.studentmgmt;

import edu.miu.cs.cs425.studentmgmt.model.Classroom;
import edu.miu.cs.cs425.studentmgmt.model.Course;
import edu.miu.cs.cs425.studentmgmt.model.Student;
import edu.miu.cs.cs425.studentmgmt.model.Transcript;
import edu.miu.cs.cs425.studentmgmt.service.ClassroomService;
import edu.miu.cs.cs425.studentmgmt.service.StudentService;
import edu.miu.cs.cs425.studentmgmt.service.TranscriptService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;

@SpringBootApplication
@Transactional
public class MyStudentManagmentAppApplication {

//	@Autowired
//	StudentService studentService;
//	@Autowired
//	TranscriptService transciptService;
//
//	@Autowired
//	ClassroomService classroomService;
	public static void main(String[] args) {
		SpringApplication.run(MyStudentManagmentAppApplication.class, args);
	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("Hello World");
//
//
//		//save transcript
//		var newTranscript = new Transcript(null ,"BS Computer Science");
//
//		System.out.println(newTranscript);
//		//save classroom
//		var newClassroom = new Classroom("McLaughlin building", "M105");
//
//		System.out.println(newClassroom);
//
//		//save course
//
//
//
//			ArrayList<Course> courses = new ArrayList<>();
//			courses.add(new Course("Software Engineering", "CS425"));
//			courses.add(new Course("Software Architecture", "CS510"));
//			courses.add(new Course("Software Testing", "CS522"));
//
//
//			// Iterate over each course using a for-each loop
//			for (Course course : courses) {
//				System.out.println("Course: " + course);
//		}
//		System.out.println(courses);
//
//		//save student
//	    var Selichii = new Student("A123", "Frank","Sam" ,"Smith", 3.45, LocalDate.of(1951, 11, 04));
//       Selichii.setClassroom(newClassroom);
//	   Selichii.setTranscript(newTranscript);
//	   Selichii.setCourse(courses);
//	   		studentService.saveStudent(Selichii);
//
//





	}

//	public Student addStudent(Student student) {
//		return studentService.saveStudent(student);

//	pu}blic void getTranscript(Transcript transcript) {
//		 transciptService.saveTranscript(transcript);
//	}
//
//	public Classroom getClassroom(Classroom classroom) {
//		return classroomService.saveClassroom(classroom);

