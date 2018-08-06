package com.training.exilant.restfulworks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class HelloWorld {
	private String message;

	public HelloWorld() {

	}

	public HelloWorld(String message) {
		this.setMessage(message);
	}

	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
