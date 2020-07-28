package com.rosealacroix.catalog.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rosealacroix.catalog.entity.Generation;
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
		return "generationform";
	}
	
	@PostMapping(path="/generationadd")
	public String submitGeneration(@Valid Generation generation, BindingResult result) {
		if(result.hasErrors()) {
			return "generationform";
		}
		generationService.createOrUpdate(generation);
		return "redirect:/generationlist";
	}
	
	@GetMapping(path = "/generationedit")
	public String displayEditForm(Model model, long id) {
		Optional<Generation> generation = generationService.findById(id);
		model.addAttribute("generation", generation.get());
		return "generationform";
	}
	
	@PostMapping(path = "/generationedit")
	public String updateGeneration(Model model, @Valid Generation generation, BindingResult result) {
		if(result.hasErrors()) {
			return "generationform";
		}
		generationService.createOrUpdate(generation);
		return "redirect:/generationlist";
	}

}
