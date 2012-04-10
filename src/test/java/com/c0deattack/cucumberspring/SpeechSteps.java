package com.c0deattack.cucumberspring;

import static org.junit.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;

public class SpeechSteps {

	@Autowired
	private App app;
	
	@Given("an application")
	public void an_application() {
		assertNotNull(app);
	}

	@Then("say something")
	public void say_something() {
		String said = app.saySomething();
		assertNotNull(said);
	}
}
