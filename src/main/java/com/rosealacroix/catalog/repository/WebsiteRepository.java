package com.rosealacroix.catalog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosealacroix.catalog.entity.Website;

public interface WebsiteRepository extends JpaRepository<Website, Long>{

	List<Website> findByOrderByName();

}
