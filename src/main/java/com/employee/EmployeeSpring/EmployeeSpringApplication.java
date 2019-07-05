package com.employee.EmployeeSpring;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.EmployeeSpring.model.AdminUser;

@MappedTypes(AdminUser.class)
@MapperScan("com.employee.EmployeeSpring.mapper")
@SpringBootApplication
public class EmployeeSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSpringApplication.class, args);
	}

}
