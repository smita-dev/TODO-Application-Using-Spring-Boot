package com.springbootApp.TodoApplication.Hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//create APi so if someone hits say-hello then should get response as "Hello! What are you learning today?"

@Controller
public class HelloController {
	
	@RequestMapping("say-hello")
	public String sayHello() {
		return "sayHello";
	}
}
