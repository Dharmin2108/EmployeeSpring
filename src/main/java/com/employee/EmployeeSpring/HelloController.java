package com.employee.EmployeeSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HelloController {

    @RequestMapping("/")
    public RedirectView index() {
    	return new RedirectView("index.html");
    }

}