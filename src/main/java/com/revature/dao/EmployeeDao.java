package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Employee;
import com.revature.util.HibernateUtil;

public class EmployeeDao {

	//CRUD
	
	public int insert(Employee e) {
		Session ses= HibernateUtil.getSession();
		
		Transaction tx = ses.beginTransaction();
		
		int pk=(int) ses.save(e);
		
		return pk;
	}
	
//	public List<Employee> findAll(){
//		
//	}
	
	public boolean delete() {
		return false;
	}
	
	public boolean update(Employee e) {
		return false;
	}
	
	
	
	
	
}
