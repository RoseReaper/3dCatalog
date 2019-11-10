package com.rosealacroix.catalog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rosealacroix.catalog.entity.Content;

public interface ContentRepository extends JpaRepository<Content, Long> {
	
	@Query("select distinct c from Content c left join fetch c.softwares order by c.name")
	List<Content> findAllWithRelations(); 

}
