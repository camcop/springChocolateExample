package com.qa.chocolate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Assinging this class to be the one talking to the front end
public class TestController {

	@GetMapping("/test")
	public String hello() {
		return "hello world";
	}

}
