package com.rosealacroix.catalog.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosealacroix.catalog.entity.Website;
import com.rosealacroix.catalog.repository.WebsiteRepository;

@Service
public class WebsiteService {
	
	@Autowired
	private WebsiteRepository websiteRepository;
	
	public List<Website> getAll() {
		return websiteRepository.findAll();
	}
	
	@Transactional
	public void create(Website website) {
		websiteRepository.save(website);
	}

}
