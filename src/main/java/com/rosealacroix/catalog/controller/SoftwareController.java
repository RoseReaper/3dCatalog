package com.rosealacroix.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rosealacroix.catalog.entity.Content;
import com.rosealacroix.catalog.entity.Software;
import com.rosealacroix.catalog.entity.Type;
import com.rosealacroix.catalog.service.SoftwareService;

@Controller
public class SoftwareController {
	
	@Autowired
	private SoftwareService softwareService;

	@GetMapping(path="/softwarelist")
	public String getAll(Model model) {
		List<Software> softwares = softwareService.getAll();
		model.addAttribute("softwares", softwares);
		return "softwarelist";
	}
	
	@GetMapping(path="/softwareadd")
	public String displayForm(Model model, Software software) {
		return "softwareadd";
	}
	
	@PostMapping(path="/softwareadd")
	public String submitSoftware(Software software) {
		softwareService.save(software);
		return "redirect:/softwarelist";
	}
	
}
