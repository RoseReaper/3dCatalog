package com.rosealacroix.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosealacroix.catalog.entity.Type;

public interface TypeRepository extends JpaRepository<Type, Long> {

}
