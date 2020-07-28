package com.rosealacroix.catalog.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosealacroix.catalog.entity.Type;
import com.rosealacroix.catalog.repository.TypeRepository;

@Service
public class TypeService {
	
	@Autowired
	private TypeRepository typeRepository;
	
	public List<Type> getAll() {
		return typeRepository.findByOrderByName();
	}
	
	public Optional<Type> findById(long id) {
		return typeRepository.findById(id);
	}
	
	@Transactional
	public void createOrUpdate(Type type) {
		typeRepository.save(type);
	}

}
