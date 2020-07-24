package com.rosealacroix.catalog.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the generation database table.
 * 
 */
@Entity
@NamedQuery(name="Generation.findAll", query="SELECT g FROM Generation g")
public class Generation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="generation_id")
	private Long id;

	@Column(name="generation_name")
	private String name;

	public Generation() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Generation)) {
			return false;
		}
		Generation generation = (Generation) obj;
		return this.id !=null && this.id.equals(generation.id);
	}
	
	public static Generation valueOf(String id) {
		if (id == null || id.isEmpty()) {
			return null;
		}
		Long idLong = Long.valueOf(id);
		Generation generation = new Generation();
		generation.setId(idLong);
		return generation;
	}

}