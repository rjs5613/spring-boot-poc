package com.rajesh.oauthpoc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name="AUTHORITY")
public class Authority implements GrantedAuthority{
	
	@Id
	private Long id;
	
	private String name;

	private static final long serialVersionUID = -7529623096506216957L;

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return name;
	}

}
