package com.rosealacroix.catalog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosealacroix.catalog.entity.Creator;

public interface CreatorRepository extends JpaRepository<Creator, Long>{
	
	List<Creator> findByOrderByName();

}
