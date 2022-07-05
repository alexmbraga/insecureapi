package com.sec4dev.unsecure.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sec4dev.unsecure.model.PersonalInfos;

@Controller 
public class UnvalidatedFormController {

	@GetMapping("/unvalidated")
	public String form2fill(Model model) {
		
		model.addAttribute("personalInfos", new PersonalInfos());
		List<String> listOfOptions = Arrays.asList("All","Some","None");
		model.addAttribute("optionsList", listOfOptions);
		
		return "unvalidated";
	}
	
	@PostMapping("/unvalidated")
	public String submitAllInfos(@ModelAttribute PersonalInfos personalInfos, Model model) {
		model.addAttribute("personalInfos", personalInfos);
		return "submit";
	}
}

