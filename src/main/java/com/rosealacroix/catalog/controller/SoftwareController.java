package com.rosealacroix.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rosealacroix.catalog.entity.Software;
import com.rosealacroix.catalog.service.SoftwareService;

@Controller
public class SoftwareController {
	
	@Autowired
	private SoftwareService softwareService;

	@GetMapping(path="/software")
	public String getAll(Model model) {
		List<Software> softwares = softwareService.getAll();
		model.addAttribute("softwares", softwares);
		return "softwares";
	}
}
