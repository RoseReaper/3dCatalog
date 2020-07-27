package com.rosealacroix.catalog.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosealacroix.catalog.entity.Creator;
import com.rosealacroix.catalog.repository.CreatorRepository;

@Service
public class CreatorService {
	
	@Autowired
	private CreatorRepository creatorRepository;
	
	public List<Creator> getAll() {
		return creatorRepository.findAll();
	}
	
	@Transactional
	public void create(Creator creator) {
		creatorRepository.save(creator);
	}

}
