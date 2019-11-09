package com.rosealacroix.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosealacroix.catalog.entity.Content;

public interface ContentRepository extends JpaRepository<Content, Long> {

}
