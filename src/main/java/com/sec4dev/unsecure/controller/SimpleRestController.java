package com.sec4dev.unsecure.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@RestController 
//@RequestMapping(value="/attacks/") 
public class SimpleRestController {

	@GetMapping("/htmlinjection1")
	public String paramName(@RequestParam(defaultValue="User") String name) {
		return "<h2> Hi, <i>" + name + "</i>! This is an HTTP Get Request </h2>";
	}
	
	@GetMapping("/htmlinjection2/{name}")
	public String pathName(@PathVariable(name="name") String name) {
		return "<h2> Hi, <i>" + name + "</i>! This is an HTTP Get Request </h2>";
	}
}


// Ataque de injeção de script por meio de um html -- HTML Injection
// <img%20src='aaa'%20onerror=alert(1)>
// http://localhost:8080/htmlinjection1?name=%3Cimg%20src=%27aaa%27%20onerror=alert(1)%3E
// http://localhost:8080/htmlinjection2/%3Cimg%20src=%27aaa%27%20onerror=alert(1)%3E
