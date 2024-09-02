package com.cyber;

import java.util.List;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student updateStudent(Student student);
	
	Student getByidStudent(Long id);
	
	void deleteStudentByID(Long id);

}
