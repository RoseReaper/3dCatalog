package com.rosealacroix.catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosealacroix.catalog.entity.Software;

@Service
public class SoftwareService {

	@Autowired
	private SoftwareRepository softwareRepository;
	
	public List<Software> getAll() {
		return softwareRepository.findAll();
	}
	
}
