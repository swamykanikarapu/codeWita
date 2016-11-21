package com.nsn.sep.services;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.nsn.sep.dao.LocalDao;
import com.nsn.sep.models.Sep_user;
import com.nsn.sep.utilities.SessionUtils;

public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	LocalDao localDao;
	@Override
	public Boolean setUserInfo(HttpServletRequest request) {
		Sep_user user = SessionUtils.setUser(request);
		return localDao.putUserInfo(user);
		
	}
	
}
