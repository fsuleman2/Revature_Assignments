package com.app.service;

public class MyService {

	
	public boolean isEvenNumber(int n) {
		return (n%2==0);
	}
	
	public boolean isValidPanNumer(String s) {
		return (s!=null && s.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"));
	}
}
