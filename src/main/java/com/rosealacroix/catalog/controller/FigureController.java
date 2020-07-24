package com.rosealacroix.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rosealacroix.catalog.entity.Figure;
import com.rosealacroix.catalog.service.FigureService;

@Controller
public class FigureController {
	
	@Autowired
	private FigureService figureService;
	
	@GetMapping(path="/figurelist")
	public String getAll(Model model) {
		List<Figure> figures = figureService.getAll();
		model.addAttribute("figures", figures);
		return "figurelist";
	}
	
	@GetMapping(path="/figureadd")
	public String displayForm(Model model, Figure figure) {
		return "figureadd";
	}
	
	@PostMapping(path="/figureadd")
	public String submitFigure(Figure figure) {
		figureService.save(figure);
		return "redirect:/figurelist";
	}

}
