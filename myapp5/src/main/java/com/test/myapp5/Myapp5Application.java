package com.test.myapp5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Myapp5Application implements CommandLineRunner  {

	@Autowired
	ApplicationContext applicationContext;
	public static void main(String[] args) {
		SpringApplication.run(Myapp5Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Address address = 
			applicationContext.getBean(Address.class);
			address.setLocation("서울");
		Employee employee 
			= applicationContext.getBean(Employee.class);
			employee.setName("홍길동");
		System.out.println(employee.getName());
		System.out.println(employee.getAddress().getLocation());

		EmployeeManager employeeManager =
			applicationContext.getBean(EmployeeManager.class);
			System.out.println(employeeManager.getAddress());

	}
}
