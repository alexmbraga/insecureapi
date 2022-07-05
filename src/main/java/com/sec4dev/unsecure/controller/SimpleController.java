package com.sec4dev.unsecure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
//@RequestMapping(value="/attacks/") 
public class SimpleController {

	@GetMapping("/")
	public String formPage() {
		return "editName";
	}
	
	@ResponseBody
	@GetMapping("/xss")
	public String paramName(@RequestParam(defaultValue="User") String name) {
		return "<h2> Hi, <i>" + name + "</i>! This is an HTTP Get Request </h2>";
	}
}


// Ataque de injeção de script <script>alert(1)</script>
// http>//localhost:8080/xss?name=<script>alert%281%29<%2Fscript>
