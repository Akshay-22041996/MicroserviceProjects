package com.nt.service;

import com.nt.dao.IEmployeeDAO;

public class EmployeeServiceImpl implements IEmployeeService {
	
	private IEmployeeDAO dao;

	public EmployeeServiceImpl(IEmployeeDAO dao) {
		System.out.println("EmployeeServiceImpl.EmployeeServiceImpl()");
		this.dao = dao;
	}

	@Override
	public String getAllEmployee() {
		int count=dao.getAllEmployee();
		return count+" no of employee data is available";
	}

	@Override
	public String getEmployeeByLocation(String location) {
		int count=dao.getEmployeeByLocation(location);
		return "Total "+count +" no of employee found";
	}

}
