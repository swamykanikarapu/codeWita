package com.nsn.sep.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@RequestMapping(value="/test")
	public @ResponseBody String getMessage() {
		
		String sql = "SELECT * FROM SEP_ROLE";

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row : rows) {
			System.out.println(row);
		}
		
		return "Hello World !!";
	}
	
	
}
