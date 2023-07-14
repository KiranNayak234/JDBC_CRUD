package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class StudentController {
	public static void main(String[] args) {
		Student s = new Student();
		StudentService service = new StudentService();
//	save
//		s.setId(8);
//		s.setName("kira");
//		s.setAge(87);
//		s.setPhone(1234567891);
//		service.save(s);
//		System.out.println("data saved");
		
//	update	
//		s.setId(2);
//		s.setName("prabha");
//		int res=service.update(s);
//         if(res>0) {
//		System.out.println("data saved");
//         }
//         else {
//        	 System.out.println("plz check the data");
//         }
//	}
//	delete
		s.setId(1);
		int res=service.delete(s);
		if(res>0) {
			System.out.println("data deleted");
		}
		else {
			System.out.println("plz check the data");
		}
	}		
}
