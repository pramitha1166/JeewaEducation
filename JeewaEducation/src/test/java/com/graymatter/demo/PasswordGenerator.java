package com.graymatter.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "hashini";
		String encodedPassword = encoder.encode(rawPassword);
		
		System.out.println(encodedPassword);
		
		
	}

}
