package com.rajesh.oauthpoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rajesh.oauthpoc.service.UserDetailService;

@RestController
@RequestMapping(path="/secured")
public class SampleController {
	
	@Autowired
	private UserDetailService userDetailService;
	
	@GetMapping("/users")
	public UserDetails getUser(@RequestParam("userName") String userName) {
		return userDetailService.loadUserByUsername(userName);
	}
}
