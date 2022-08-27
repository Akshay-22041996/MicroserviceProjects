package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;



public class EmployeeDAOImpl implements IEmployeeDAO {
	
	private static final String GET_EMPLOYEE_BY_LOCATION="SELECT COUNT(*) FROM EMPLOYEEDB WHERE EADDRESS=?";
	private static final String GET_ALL_EMPLOYEE_COUNT="SELECT COUNT(*) FROM EMPLOYEEDB";
	
	private JdbcTemplate jt;
	
	public EmployeeDAOImpl(JdbcTemplate jt) {
		System.out.println("EmployeeDAOImpl.EmployeeDAOImpl()");
		this.jt = jt;
	}

	@Override
	public int getAllEmployee() {
		int count=jt.queryForObject(GET_ALL_EMPLOYEE_COUNT,Integer.class);
		return count;
	}

	@Override
	public int getEmployeeByLocation(String location) {
		int count=jt.queryForObject(GET_EMPLOYEE_BY_LOCATION, Integer.class,location);
		return count;
	}

}
