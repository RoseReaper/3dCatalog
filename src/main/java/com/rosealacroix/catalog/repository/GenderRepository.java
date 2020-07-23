package com.rosealacroix.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosealacroix.catalog.entity.Gender;

public interface GenderRepository extends JpaRepository<Gender, Long>{

}
