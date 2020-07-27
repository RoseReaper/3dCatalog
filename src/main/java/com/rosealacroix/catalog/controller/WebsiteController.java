package com.rosealacroix.catalog.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rosealacroix.catalog.entity.Website;
import com.rosealacroix.catalog.service.WebsiteService;

@Controller
public class WebsiteController {
	
	@Autowired
	private WebsiteService websiteService;

	@GetMapping(path="/websitelist")
	public String getAll(Model model) {
		List<Website> websites = websiteService.getAll();
		model.addAttribute("websites", websites);
		return "websitelist";
	}
	
	@GetMapping(path="/websiteadd")
	public String displayForm(Model model, Website website) {
		return "websiteadd";
	}
	
	@PostMapping(path="/websiteadd")
	public String submitWebsite(@Valid Website website, BindingResult result) {
		if(result.hasErrors()) {
			return "websiteadd";
		}
		websiteService.create(website);
		return "redirect:/websitelist";
	}

}
