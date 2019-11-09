package com.rosealacroix.catalog.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the creator database table.
 * 
 */
@Entity
@NamedQuery(name="Creator.findAll", query="SELECT c FROM Creator c")
public class Creator implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="vendor_id")
	private Long id;

	@Column(name="vendor_name")
	private String name;

	//bi-directional many-to-many association to Content
	@ManyToMany
	@JoinTable(
		name="is_made_by"
		, joinColumns={
			@JoinColumn(name="vendor_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="content_id")
			}
		)
	private List<Content> contents;

	public Creator() {
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

}