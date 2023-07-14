package com.jsp.service;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {
	StudentDao dao = new StudentDao();

	public int save(Student student) {
	  return dao.save(student);
	}
	  
	  public int delete(Student student) {
		  return dao.delete(student);
	  }
	 public int update(Student student) {
		 return dao.updateStudent(student);
	 }
}
