package com.employee.EmployeeSpring.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.employee.EmployeeSpring.model.AdminUser;

@Mapper
public interface AdminUserMapper {
	@Select("select * from admin_user where email=#{email}")
	AdminUser findUser(String email);
}
