package com.ram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	
	private Heart heart;

	@Autowired
	public Human(Heart heart) {
		this.heart = heart;
	}
	
	

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	
	public void startPumping() {
		heart.pump();
	}
	

}
