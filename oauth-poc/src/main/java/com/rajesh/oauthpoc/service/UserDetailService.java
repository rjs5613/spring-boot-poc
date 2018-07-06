package com.rajesh.oauthpoc.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rajesh.oauthpoc.entity.User;
import com.rajesh.oauthpoc.repository.UserRepository;

@Service
public class UserDetailService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUserName(username);
		if(Objects.isNull(user)) {
			throw new UsernameNotFoundException("No User With userName "+username);
		}
		return user;
	}

}
