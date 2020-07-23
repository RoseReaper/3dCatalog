package com.rosealacroix.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rosealacroix.catalog.entity.Generation;
import com.rosealacroix.catalog.entity.Software;
import com.rosealacroix.catalog.service.GenerationService;

@Controller
public class GenerationController {
	
	@Autowired
	private GenerationService generationService;

	@GetMapping(path="/generationlist")
	public String getAll(Model model) {
		List<Generation> generations = generationService.getAll();
		model.addAttribute("generations", generations);
		return "generationlist";
	}
	
	@GetMapping(path="/generationadd")
	public String displayForm(Model model, Generation generation) {
		return "generationadd";
	}
	
	@PostMapping(path="/generationadd")
	public String submitGeneration(Generation generation) {
		generationService.save(generation);
		return "redirect:/generationlist";
	}

}
