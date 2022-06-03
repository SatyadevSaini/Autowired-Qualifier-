package com.incapp.bean;

import org.springframework.stereotype.Component;

@Component
public class MECategory implements Category{

	@Override
	public String printCategory() {
		
		return "This is MECategory here";
	}

}
