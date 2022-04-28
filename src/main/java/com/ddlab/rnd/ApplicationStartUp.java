package com.ddlab.rnd;

import com.ddlab.rnd.components.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.util.CommonUtil;

import java.util.List;

@Component
public class ApplicationStartUp {

	@Autowired
	private List<Validation> validationList;

	@EventListener(ApplicationReadyEvent.class)
	public void afterStartup() {
		System.out.println("Application Started at : " + CommonUtil.timeNow());
		check();
	}

	public void check() {
		for(int i = 0; i < validationList.size(); i++) {
			System.out.println(validationList.get(i).validate());
		}
	}
}
