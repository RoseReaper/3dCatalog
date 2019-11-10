package com.rosealacroix.catalog.controller;

import java.util.List;

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
	
	@GetMapping(path="/content")
	public String getAll(Model model) {
		List<Content> contents = contentService.getAll();
		model.addAttribute("contents", contents);
		return "contents";
	}
	
	@GetMapping(path="/addcontent")
	public String displayForm(Model model, Content content) {
		List<Type> types = typeService.getAll();
		model.addAttribute("types", types);
		return "addcontent";
	}
	
//	@PostMapping(path="/content")
//	public String submitContent(Content content) {
//		return "contentdetail";
//	}

}
