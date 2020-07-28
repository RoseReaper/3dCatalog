package com.rosealacroix.catalog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosealacroix.catalog.entity.Generation;

public interface GenerationRepository extends JpaRepository<Generation, Long>{

	List<Generation> findByOrderByName();

}
