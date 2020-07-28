package com.rosealacroix.catalog.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosealacroix.catalog.entity.Software;
import com.rosealacroix.catalog.repository.SoftwareRepository;

@Service
public class SoftwareService {

	@Autowired
	private SoftwareRepository softwareRepository;
	
	public List<Software> getAll() {
		return softwareRepository.findByOrderByName();
	}
	
	public Optional<Software> findById(long id) {
        return softwareRepository.findById(id);
    }
	
	@Transactional
	public void create(Software software) {
		softwareRepository.save(software);
	}
	
}
