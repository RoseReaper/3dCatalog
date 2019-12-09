package com.rosealacroix.catalog.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosealacroix.catalog.entity.Content;
import com.rosealacroix.catalog.repository.ContentRepository;

@Service
public class ContentService {
	
	@Autowired
	private ContentRepository contentRepository;
	
	public List<Content> getAll() {
		return contentRepository.findAllWithRelations();
	}
	
	public Optional<Content> findById(long id) {
        return contentRepository.findById(id);
    }
	
	@Transactional
	public void save(Content content) {
		contentRepository.save(content);
	}

}
