package com.graymatter.demo.visasecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.graymatter.demo.model.VisaStudent;
import com.sun.security.auth.UserPrincipal;

@Service
public class VisaStudentUserDetailsService implements UserDetailsService {

	@Autowired
	VisaStudentLoginRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		VisaStudent visastd = repo.findByUsername(username);
		
		if(visastd==null) {
			throw new UsernameNotFoundException("Not Found 404");
		}
		
		return new VisaStudentLoginPrinciple(visastd);
	}

}
