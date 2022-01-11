package com.stacksimplify.restservices.Hello;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {
	
	//Simple method
	//URI - /helloworld
	//GET
	//@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	@GetMapping("/helloworld1")
	public String helloWorld() {
		
		
		return "Hello World";
	}
	
	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Carlos", "Mata", "Yucatan");
	}
}
