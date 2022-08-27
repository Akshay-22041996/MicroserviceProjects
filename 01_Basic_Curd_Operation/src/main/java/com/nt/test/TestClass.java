package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;

public class TestClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		MainController contr=ctx.getBean("controller", MainController.class);
		
		String msg=contr.getAllEmployee();
		System.out.println(msg);
		System.out.println("***************************************************************");
		
		String message=contr.getEmployeeByLocation("raipur");
		System.out.println(message);
	}

}
