package com.graymatter.demo.visasecurity;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.graymatter.demo.model.VisaStudent;

public class VisaStudentLoginPrinciple implements UserDetails {

	@Autowired
	private VisaStudent visastd;
	
	public VisaStudentLoginPrinciple(VisaStudent visastd) {
		super();
		this.visastd = visastd;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Collections.singleton(new SimpleGrantedAuthority("USER"));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return visastd.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return visastd.getUsername();
	}

	
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
