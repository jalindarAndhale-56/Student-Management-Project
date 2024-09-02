package com.cyber;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
	
	private StudentService srService;

	public StudentController(StudentService srService) {
		this.srService = srService;
	}
	
	@GetMapping("/students")
	public String ListOfStudents(Model model) {
		model.addAttribute("student",srService.getAllStudents());
		return "students";
	}
	
	
	@GetMapping("/student/new")
	public String createstedentForm(Model model) {
		// this object is used to hold student form data
		Student student=new Student();
		model.addAttribute("student",student);
		return "create_student";
	}
	
	
	@PostMapping("/students")
	public String studentFormADD(@ModelAttribute("student") Student student) {	
		srService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/student/edit/{id}")
	public String EditStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", srService.getByidStudent(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String UpdateStudent(@PathVariable  Long id,@ModelAttribute("student") Student student, Model model) {
		// get student from database by  providing the id
		Student edistudent=srService.getByidStudent(id);
		edistudent.setFirstName(student.getFirstName());
		edistudent.setLastName(student.getLastName());
		edistudent.setEmaiID(student.getEmaiID());
		edistudent.setBranch(student.getBranch());
		
		// saving the object of student class
		srService.saveStudent(edistudent);
		return"redirect:/students";
	}
	
	// handler method to delete the data from student table
	
	@GetMapping("/student/delete/{id}")
	public String deletestudentFROMDATABASE(@PathVariable Long id) {
		srService.deleteStudentByID(id);
		return "redirect:/students";
	}
}
