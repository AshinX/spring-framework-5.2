package com.fengyue.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Object student = context.getBean("student");
		System.out.println(student);

	}

}
