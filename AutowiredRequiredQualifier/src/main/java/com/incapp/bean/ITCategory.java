package com.incapp.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ITCategory implements Category {

	@Override
	public String printCategory() {
		
		return "This is ITCategory";
	}
}
