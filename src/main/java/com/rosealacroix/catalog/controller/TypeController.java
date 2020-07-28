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

import com.rosealacroix.catalog.entity.Type;
import com.rosealacroix.catalog.service.TypeService;

@Controller
public class TypeController {
	
	@Autowired
	private TypeService typeService;

	@GetMapping(path="/typelist")
	public String getAll(Model model) {
		List<Type> types = typeService.getAll();
		model.addAttribute("types", types);
		return "typelist";
	}
	
	@GetMapping(path="/typeadd")
	public String displayForm(Model model, Type type) {
		return "typeform";
	}
	
	@PostMapping(path="/typeadd")
	public String submitType(@Valid Type type, BindingResult result) {
		if(result.hasErrors()) {
			return "typeform";
		}
		typeService.createOrUpdate(type);
		return "redirect:/typelist";
	}
	
	@GetMapping(path = "/typeedit")
	public String displayEditForm(Model model, long id) {
		Optional<Type> type = typeService.findById(id);
		model.addAttribute("type", type.get());
		return "typeform";
	}
	
	@PostMapping(path = "/typeedit")
	public String updateType(Model model, @Valid Type type, BindingResult result) {
		if(result.hasErrors()) {
			return "typeform";
		}
		typeService.createOrUpdate(type);
		return "redirect:/typelist";
	}

}
