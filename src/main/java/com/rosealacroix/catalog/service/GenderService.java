package com.rosealacroix.catalog.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosealacroix.catalog.entity.Gender;
import com.rosealacroix.catalog.repository.GenderRepository;

@Service
public class GenderService {
	
	@Autowired
	private GenderRepository genderRepository;
	
	public List<Gender> getAll() {
		return genderRepository.findByOrderByName();
	}
	
	public Optional<Gender> findById(long id) {
		return genderRepository.findById(id);
	}
	
	@Transactional
	public void createOrUpdate(Gender gender) {
		genderRepository.save(gender);
	}

}
