package com.cjc.main.service;

import com.cjc.main.model.Student;

public interface HomeService
{

	public void saveData(Student s);
	public Student logincheck(String uname,String pass);
	public Iterable<Student> displayAllData();
	public void deleteData(Student s);
	public Student editData(int uid);
	
}
