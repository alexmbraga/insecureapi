package com.sec4dev.unsecure.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sec4dev.unsecure.model.ValidatedInfos;

@Controller 
public class ValidatedFormController {

	@GetMapping("/validated")
	public String form2fill(Model model) {
		
		model.addAttribute("validatedInfos", new ValidatedInfos());
		List<String> listOfOptions = Arrays.asList("All","Some","None");
		model.addAttribute("optionsList", listOfOptions);
		
		return "validated";
	}
	
	@PostMapping("/validated")
	public String submitAllInfos(@Valid @ModelAttribute("validatedInfos") ValidatedInfos validatedInfos,
			BindingResult bindingResult, Model model) {
		//model.addAttribute("validatedInfos", validatedInfos);
		
		List<String> listOfOptions = Arrays.asList("All","Some","None");
		model.addAttribute("optionsList", listOfOptions);
		
		if(bindingResult.hasErrors()) {
			System.out.println("Há erros!");
			return "validated"; 
		}
		System.out.println("Sem erros!");
		
		return "submitValid";
	}
}

