package com.nsn.sep.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nsn.sep.services.RegistrationService;



@Controller
public class RegistrationController {
	//private static final Log log = LogFactory.getLog(RegistrationController.class);
	@Autowired
	RegistrationService registrationService;
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public @ResponseBody String putUserInfo(HttpServletRequest request) {
		boolean sample=registrationService.setUserInfo(request);
		if(sample){
			return "registration successfull";
		}
		else
			return "registration failed";
	}
}
