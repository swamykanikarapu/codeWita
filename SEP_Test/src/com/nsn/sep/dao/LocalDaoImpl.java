package com.nsn.sep.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.nsn.sep.models.Sep_user;

public class LocalDaoImpl implements LocalDao{
	HibernateTemplate template;

	@Override
	public boolean putUserInfo(Sep_user user) {
		
		return (Boolean) template.save(user);
	}
		      		 
	  
	}  

