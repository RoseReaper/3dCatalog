package com.rosealacroix.catalog.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;


/**
 * The persistent class for the gender database table.
 * 
 */
@Entity
@NamedQuery(name="Gender.findAll", query="SELECT g FROM Gender g")
public class Gender implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="gender_id")
	private Long id;

	@NotEmpty(message = "Please enter the gender''s name.")
	@Column(name="gender_name")
	private String name;
	
	//bi-directional many-to-one association to Content
	@OneToMany(mappedBy="gender")
	private List<Content> contents;

	public Gender() {
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
		if (!(obj instanceof Gender)) {
			return false;
		}
		Gender gender = (Gender) obj;
		return this.id !=null && this.id.equals(gender.id);
	}
	
	public static Gender valueOf(String id) {
		if (id == null || id.isEmpty()) {
			return null;
		}
		Long idLong = Long.valueOf(id);
		Gender gender = new Gender();
		gender.setId(idLong);
		return gender;
	}

}