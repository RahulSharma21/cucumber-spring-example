package com.c0deattack.cucumberspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.c0deattack.cucumberspring.service.Speech;

@Component
public class App {
	
	private Speech speech;
	
	@Autowired
	public void setSpeech(Speech speech) {
		this.speech = speech;
	}
	
	public String saySomething() {
		return speech.speak();
	}

}
