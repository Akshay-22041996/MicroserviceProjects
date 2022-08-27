package com.nt.controller;

import com.nt.service.IEmployeeService;

public class MainController {

	private IEmployeeService ser;
	
	public MainController(IEmployeeService ser) {
		System.out.println("MainController.MainController()");
		this.ser = ser;
	}


	public String getAllEmployee() {
		String msg=ser.getAllEmployee();
		return "Total no of employee is::"+msg;
	}
	
	public String getEmployeeByLocation(String empLocation) {
		String msg=ser.getEmployeeByLocation(empLocation);
		return msg;
	}
}
