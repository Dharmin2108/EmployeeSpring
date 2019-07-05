package com.employee.EmployeeSpring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.employee.EmployeeSpring.mapper.AdminUserMapper;
import com.employee.EmployeeSpring.model.AdminUser;

@Controller
public class LoginController {
	
	
	public LoginController(AdminUserMapper adminUserMapper) {
		super();
		this.adminUserMapper = adminUserMapper;
	}

	private AdminUserMapper adminUserMapper;
	
    @RequestMapping("/login")
    public String authenticateUser(HttpServletRequest req,HttpServletResponse res,@RequestParam String email,@RequestParam String password) {
    	AdminUser user = adminUserMapper.findUser(email);
    	String enteredPassword=DigestUtils.shaHex(password);
    	System.out.println(user.getEmail());
    	if(user == null || !enteredPassword.equals(user.getPassword())) {
    		req.setAttribute("msg", "invalid email or password");
    		return "index";
    	}
    	return "index";
    }

}