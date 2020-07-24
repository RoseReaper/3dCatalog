package com.rosealacroix.catalog.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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

}