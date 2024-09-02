package com.cyber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	public studentRepository sr;
	@Override
	public void run(String... args) throws Exception {
	
//		Student stu=new Student("Ashok","kamble","ashok3@.gmail","A--");
//		sr.save(stu);
//		Student stu1=new Student("shivaji","garje","shivaji33@.gmail","BBB");
//		sr.save(stu1);
//		Student stu2=new Student("sanket","divte","sanket3@.gmail","AAA++");
//		sr.save(stu2);		
	}

}
