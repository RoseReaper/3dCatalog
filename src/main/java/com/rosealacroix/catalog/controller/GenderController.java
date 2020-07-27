package com.rosealacroix.catalog.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rosealacroix.catalog.entity.Gender;
import com.rosealacroix.catalog.service.GenderService;

@Controller
public class GenderController {
	
	@Autowired
	private GenderService genderService;

	@GetMapping(path="/genderlist")
	public String getAll(Model model) {
		List<Gender> genders = genderService.getAll();
		model.addAttribute("genders", genders);
		return "genderlist";
	}
	
	@GetMapping(path="/genderadd")
	public String displayForm(Model model, Gender gender) {
		return "genderadd";
	}
	
	@PostMapping(path="/genderadd")
	public String submitGender(@Valid Gender gender, BindingResult result) {
		if(result.hasErrors()) {
			return "genderadd";
		}
		genderService.create(gender);
		return "redirect:/genderlist";
	}

}
