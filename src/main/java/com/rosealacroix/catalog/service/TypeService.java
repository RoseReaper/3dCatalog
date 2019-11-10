package com.rosealacroix.catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosealacroix.catalog.entity.Type;
import com.rosealacroix.catalog.repository.TypeRepository;

@Service
public class TypeService {
	
	@Autowired
	private TypeRepository typeRepository;
	
	public List<Type> getAll() {
		return typeRepository.findAll();
	}

}