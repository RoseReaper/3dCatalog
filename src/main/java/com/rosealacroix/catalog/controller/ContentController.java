package com.rosealacroix.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rosealacroix.catalog.entity.Content;
import com.rosealacroix.catalog.service.ContentService;

@Controller
public class ContentController {
	
	@Autowired
	private ContentService contentService;
	
	@GetMapping(path="/content")
	public String getAll(Model model) {
		List<Content> contents = contentService.getAll();
		model.addAttribute("contents", contents);
		return "contents";
	}

}
