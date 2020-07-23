package com.rosealacroix.catalog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rosealacroix.catalog.entity.Content;
import com.rosealacroix.catalog.entity.Creator;
import com.rosealacroix.catalog.entity.Gender;
import com.rosealacroix.catalog.entity.Generation;
import com.rosealacroix.catalog.entity.Software;
import com.rosealacroix.catalog.entity.Type;
import com.rosealacroix.catalog.entity.Website;
import com.rosealacroix.catalog.service.ContentService;
import com.rosealacroix.catalog.service.CreatorService;
import com.rosealacroix.catalog.service.GenderService;
import com.rosealacroix.catalog.service.GenerationService;
import com.rosealacroix.catalog.service.SoftwareService;
import com.rosealacroix.catalog.service.TypeService;
import com.rosealacroix.catalog.service.WebsiteService;

@Controller
public class ContentController {
	
	@Autowired
	private ContentService contentService;
	@Autowired
	private TypeService typeService;
	@Autowired
	private SoftwareService softwareService;
	@Autowired
	private WebsiteService websiteService;
	@Autowired
	private CreatorService creatorService;
	
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
		List<Software> softwares = softwareService.getAll();
		List<Website> websites = websiteService.getAll();
		List<Creator> creators = creatorService.getAll();
		model.addAttribute("types", types);
		model.addAttribute("softwares", softwares);
		model.addAttribute("websites", websites);
		model.addAttribute("creators", creators);
		return "contentadd";
	}
	
	@PostMapping(path="/contentadd")
	public String submitContent(Content content) {
		contentService.save(content);
		return "redirect:/home";
	}

}