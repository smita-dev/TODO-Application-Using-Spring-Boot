package com.springbootApp.TodoApplication.Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//create APi so if someone hits say-hello then should get response as "Hello! What are you learning today?"

@RestController
public class HelloController {
	
	@RequestMapping("/say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
}
