package com.ashok.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class SecurityService {
	int k=100;
	public static String encodePassword(String txt) {
		Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(txt.getBytes());
		
		
	}
	public static String decode(String txt) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(txt);
		return new String(decode);
	}
	
	public static void main(String[] args) {
		SecurityService securityService=new SecurityService();
		String encodePassword = SecurityService.encodePassword("Gadilingappa");
		System.out.println(encodePassword);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
