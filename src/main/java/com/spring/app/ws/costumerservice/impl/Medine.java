package com.spring.app.ws.costumerservice.impl;

public class Medine {
	
	static int yas;
	int boy;
	String medeniDurum;

	Samet s;
	
	
	public String call() {
		System.out.println("Sameti ara");
		return "Sameti ara";
		
	}
	
	public Medine(int yas, int boy, String medeniDurum) {
		
		this.yas = yas;
		this.boy = boy;
		this.medeniDurum = medeniDurum;
		
		System.out.println("sqsasas");
	}
}
