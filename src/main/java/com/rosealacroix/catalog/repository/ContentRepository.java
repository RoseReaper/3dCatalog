package com.rosealacroix.catalog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rosealacroix.catalog.entity.Content;

public interface ContentRepository extends JpaRepository<Content, Long> {
	
	@Query("select distinct c from Content c where c.active = true order by c.name")
	List<Content> findAllActive();
	
	@Modifying
	@Query("update Content as c set c.active = false where c.id = :id")
	void deactivate(@Param("id") Long id);

}
