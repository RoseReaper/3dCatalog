package com.rosealacroix.catalog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rosealacroix.catalog.test.NomAge;

@Controller
public class NomAgeController {
	
	@GetMapping(path="/nomage")
	public String afficherFormulaire(Model model) {
		NomAge na = new NomAge();
		na.setNom("Elodie");
		model.addAttribute("na", na);
		
		return "nomage";
	}
	
	@PostMapping(path="/nomage")
	public String envoyerFormulaire(@ModelAttribute("na") NomAge na) {
		return "resultatnomage";
	}

}
