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
 * The persistent class for the type database table.
 * 
 */
@Entity
@NamedQuery(name="Type.findAll", query="SELECT t FROM Type t")
public class Type implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="type_id")
	private Long id;

	@NotEmpty(message = "Please enter the type''s name.")
	@Column(name="type_name")
	private String name;

	//bi-directional many-to-one association to Content
	@OneToMany(mappedBy="type")
	private List<Content> contents;

	public Type() {
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

	public List<Content> getContents() {
		return this.contents;
	}

	public void setContents(List<Content> contents) {
		this.contents = contents;
	}

	public Content addContent(Content content) {
		getContents().add(content);
		content.setType(this);

		return content;
	}

	public Content removeContent(Content content) {
		getContents().remove(content);
		content.setType(null);

		return content;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Type)) {
			return false;
		}
		Type type = (Type) obj;
		return this.id !=null && this.id.equals(type.id);
	}
	
	public static Type valueOf(String id) {
		if (id == null || id.isEmpty()) {
			return null;
		}
		Long idLong = Long.valueOf(id);
		Type type = new Type();
		type.setId(idLong);
		return type;
	}

}