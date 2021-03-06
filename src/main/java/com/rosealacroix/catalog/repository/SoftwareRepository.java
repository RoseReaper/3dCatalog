package com.rosealacroix.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosealacroix.catalog.entity.Software;

public interface SoftwareRepository extends JpaRepository<Software, Long> {

}
