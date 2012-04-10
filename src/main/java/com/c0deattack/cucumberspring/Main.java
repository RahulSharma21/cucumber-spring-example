package com.c0deattack.cucumberspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "beans.xml" });
		App app = (App) context.getBean("app");
		app.saySomething();
	}

}
