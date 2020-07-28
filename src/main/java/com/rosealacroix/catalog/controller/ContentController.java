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
	@Autowired
	private GenderService genderService;
	@Autowired
	private GenerationService generationService;

	@GetMapping(path = "/home")
	public String getAll(Model model) {
		List<Content> contentlist = contentService.getAll();
		model.addAttribute("contentlist", contentlist);
		return "contentlist";
	}

	@GetMapping(path = "/contentdetail")
	public String findById(Model model, long id) {
		Optional<Content> contentdetail = contentService.findById(id);
		model.addAttribute("contentdetail", contentdetail.get());
		return "contentdetail";
	}

	@GetMapping(path = "/contentadd")
	public String displayForm(Model model, Content content) {
		this.addConstraintParameters(model);
		return "contentform";
	}

	@PostMapping(path = "/contentadd")
	public String submitContent(Model model, @Valid Content content, BindingResult result) {
		if(result.hasErrors()) {
			return this.displayForm(model, content);
		}
		contentService.createOrUpdate(content);
		return "redirect:/home";
	}
	
	@PostMapping(path = "/contentdelete")
	public String deleteContent(Content content) {
		contentService.deactivate(content);
		return "redirect:/home";
	}
	
	@GetMapping(path = "/contentedit")
	public String displayEditForm(Model model, long id) {
		this.addConstraintParameters(model);
		Optional<Content> contentdetail = contentService.findById(id);
		model.addAttribute("content", contentdetail.get());
		return "contentform";
	}
	
	@PostMapping(path = "/contentedit")
	public String updateContent(Model model, @Valid Content content, BindingResult result) {
		if(result.hasErrors()) {
			this.addConstraintParameters(model);
			return "contentform";
		}
		contentService.createOrUpdate(content);
		return "redirect:/home";
	}
	
	private void addConstraintParameters(Model model) {
		List<Type> types = typeService.getAll();
		List<Software> softwares = softwareService.getAll();
		List<Website> websites = websiteService.getAll();
		List<Creator> creators = creatorService.getAll();
		List<Gender> genders = genderService.getAll();
		List<Generation> generations = generationService.getAll();
		model.addAttribute("types", types);
		model.addAttribute("softwares", softwares);
		model.addAttribute("websites", websites);
		model.addAttribute("creators", creators);
		model.addAttribute("genders", genders);
		model.addAttribute("generations", generations);
	}

}