package sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	private String hello() {
		// TODO Auto-generated method stub
		return "Hello World111";
	}

}
