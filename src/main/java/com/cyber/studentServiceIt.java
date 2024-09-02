package com.cyber;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class studentServiceIt implements StudentService {

	private studentRepository sr;	
	public studentServiceIt(studentRepository sr) {
		this.sr = sr;
	}
	
	@Override
	public List<Student> getAllStudents() {	
		return sr.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return sr.save(student);
	}

	public Student getByidStudent(Long id) {
			
		return sr.findById(id).get();
	}
	
	@Override
	public Student updateStudent(Student student) {
		return sr.save(student);
	}

	public void deleteStudentByID(Long id) {
		sr.deleteById(id);
	}


}
