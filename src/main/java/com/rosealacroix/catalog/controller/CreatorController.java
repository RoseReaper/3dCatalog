package com.rosealacroix.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rosealacroix.catalog.entity.Creator;
import com.rosealacroix.catalog.service.CreatorService;

@Controller
public class CreatorController {
	
	@Autowired
	private CreatorService creatorService;

	@GetMapping(path="/creatorlist")
	public String getAll(Model model) {
		List<Creator> creators = creatorService.getAll();
		model.addAttribute("creators", creators);
		return "creatorlist";
	}
	
	@GetMapping(path="/creatoradd")
	public String displayForm(Model model, Creator creator) {
		return "creatoradd";
	}
	
	@PostMapping(path="/creatoradd")
	public String submitCreator(Creator creator) {
		creatorService.save(creator);
		return "redirect:/creatorlist";
	}

}
