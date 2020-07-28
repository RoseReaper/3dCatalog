package com.rosealacroix.catalog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosealacroix.catalog.entity.Type;

public interface TypeRepository extends JpaRepository<Type, Long> {

	List<Type> findByOrderByName();

}
