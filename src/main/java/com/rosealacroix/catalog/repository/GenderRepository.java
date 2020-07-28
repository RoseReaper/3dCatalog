package com.rosealacroix.catalog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosealacroix.catalog.entity.Gender;

public interface GenderRepository extends JpaRepository<Gender, Long>{

	List<Gender> findByOrderByName();

}
