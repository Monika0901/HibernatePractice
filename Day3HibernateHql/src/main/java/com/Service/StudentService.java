package com.Service;

import com.Dao.StudentDao;
import com.POJO.Students;

public class StudentService {

	//insertData
	public void insertData(Students std) {
	StudentDao dao = new StudentDao();
	dao.insertData(std);
	}
	
	//updateData
	public void updateData(Students std) {
        StudentDao dao = new StudentDao();
        dao.updateData(std);
    }
	
	//deleteData
	public void  deleteData(Students std) {
        StudentDao dao = new StudentDao();
        dao. deleteData(std);
    }
	
	//GetSingleResult
	public void  GetSingleResult(Students std) {
       StudentDao dao = new StudentDao();
       dao. GetSingleResult(std);
	}
	
	//FetchAllData
	public void  FetchAllData(Students std) {
        StudentDao dao = new StudentDao();
        dao. FetchAllData(std);
    }
}
