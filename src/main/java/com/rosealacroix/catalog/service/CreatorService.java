package com.rosealacroix.catalog.service;

import java.util.List;
import java.util.Optional;

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
		return creatorRepository.findByOrderByName();
	}
	
	public Optional<Creator> findById(long id) {
		return creatorRepository.findById(id);
	}
	
	@Transactional
	public void createOrUpdate(Creator creator) {
		creatorRepository.save(creator);
	}

}
