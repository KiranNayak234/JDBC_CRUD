package com.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.dto.Student;

public class StudentDao {
	Student student = new Student();

	public int save(Student student) {
		try {
//		   1st step
			Class.forName("com.mysql.cj.jdbc.Driver");
//		2nd step
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbc_crud1?user=root&password=root");
//		3rd step
			PreparedStatement ps = connection.prepareStatement("insert into student values(?,?,?,?)");
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setInt(3, student.getAge());
			ps.setDouble(4, student.getPhone());

			int res = ps.executeUpdate();
			connection.close();
			return res;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int delete(Student student) {
		try {
//		   1st step
			Class.forName("com.mysql.cj.jdbc.Driver");
//		2nd step
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbc_crud1?user=root&password=root");
//		3rd step
			PreparedStatement ps1 = connection.prepareStatement("delete from student where id=?");
			ps1.setInt(1, student.getId());

			int res=ps1.executeUpdate();
			connection.close();

			return res;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
//	update
	public int updateStudent(Student student) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud1?user=root&password=root");
			
			PreparedStatement ps2=connection.prepareStatement("update Student set name='?' where id=?");
			ps2.setInt(1, student.getId());
			ps2.setString(2, student.getName());
			
			int res=ps2.executeUpdate();
			connection.close();
			
			return res;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}

	
}
