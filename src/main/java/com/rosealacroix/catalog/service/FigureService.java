package com.rosealacroix.catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosealacroix.catalog.entity.Figure;
import com.rosealacroix.catalog.repository.FigureRepository;

@Service
public class FigureService {
	
	@Autowired
	private FigureRepository figureRepository;
	
	public List<Figure> getAll() {
		return figureRepository.findAll();
	}

}
