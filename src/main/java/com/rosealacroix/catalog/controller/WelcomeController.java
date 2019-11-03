package com.rosealacroix.catalog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@GetMapping(path="/welcome")
	public String welcome(@RequestParam(required=false, defaultValue="everybody") String who, Model model) {
		model.addAttribute("who", who);
		return "welcome";
	}
}
