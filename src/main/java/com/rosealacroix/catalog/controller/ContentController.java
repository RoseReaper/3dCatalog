package com.rosealacroix.catalog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rosealacroix.catalog.entity.Content;
import com.rosealacroix.catalog.entity.Type;
import com.rosealacroix.catalog.service.ContentService;
import com.rosealacroix.catalog.service.TypeService;

@Controller
public class ContentController {
	
	@Autowired
	private ContentService contentService;
	@Autowired
	private TypeService typeService;
	
	@GetMapping(path="/home")
	public String getAll(Model model) {
		List<Content> contentlist = contentService.getAll();
		model.addAttribute("contentlist", contentlist);
		return "contentlist";
	}
	
	@GetMapping(path="/contentdetail")
	public String findById(Model model, long id) {
		Optional<Content> contentdetail = contentService.findById(id);
		model.addAttribute("contentdetail", contentdetail.get());
		return "contentdetail";
	}
	
	@GetMapping(path="/contentadd")
	public String displayForm(Model model, Content content) {
		List<Type> types = typeService.getAll();
		model.addAttribute("types", types);
		return "contentadd";
	}
	
	@PostMapping(path="/contentadd")
	public String submitContent(Content content) {
		contentService.save(content);
		return "contentdetail";
	}

}