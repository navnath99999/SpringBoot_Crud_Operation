package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService 
{

	@Autowired
	HomeRepository hr;
	
	@Override
	public void saveData(Student s) 
	{
	
		hr.save(s);
		
	}

	@Override
	public Student logincheck(String uname, String pass) 
	{
	
		return hr.findAllByUnameAndPassword(uname, pass);
	}

	@Override
	public Iterable<Student> displayAllData() {
		
		return hr.findAll();
	}

	@Override
	public void deleteData(Student s) {
		
		hr.delete(s);
		
	}

	@Override
	public Student editData(int uid) 
	{
	
	return hr.findAllByUid(uid);
		
	}

}
