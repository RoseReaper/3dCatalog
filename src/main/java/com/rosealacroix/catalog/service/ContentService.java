package com.rosealacroix.catalog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rosealacroix.catalog.entity.Content;

@Service
public class ContentService {
	
	
	public List<Content> getAll() {
		List<Content> l = new ArrayList<Content>();
		
		Content c1 = new Content();
		c1.setId(1L);
		c1.setName("Victoria");
		c1.setSku("123456789");
		
		l.add(c1);
		
		return l;
	}

}
