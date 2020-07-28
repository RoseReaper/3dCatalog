package com.rosealacroix.catalog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosealacroix.catalog.entity.Software;

public interface SoftwareRepository extends JpaRepository<Software, Long> {

	List<Software> findByOrderByName();
	
}
