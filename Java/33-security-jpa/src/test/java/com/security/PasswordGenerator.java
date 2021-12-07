package com.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String textPassword = "seguranca";
		String encodedPassword = encoder.encode(textPassword);
		
		System.out.println(encodedPassword);
	}

}
