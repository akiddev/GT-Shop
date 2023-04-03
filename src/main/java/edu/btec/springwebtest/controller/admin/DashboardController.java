package edu.btec.springwebtest.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/dashboard")
public class DashboardController {
	@RequestMapping("")
	public String dashboard(ModelMap model) {
		return "admin/dashboard/dashboard";
	}
}
