package com.Service;

import com.Dao.StudenDao;
import com.POJO.Student;

public class StudentService {

	public void addStudent(Student std) {
		StudenDao dao = new StudenDao();
		dao.saveStudent(std);
	}

	public void deleteStudnt(Student std) {
		StudenDao dao = new StudenDao();
		dao.deleteStudent(std);
	}

	public void updateStudent(Student std) {
		StudenDao dao = new StudenDao();
		dao.updateStudent(std);
	}

	public void showstudent(Student std) {
		StudenDao dao = new StudenDao();
		dao.showstudent(std);
	}
}