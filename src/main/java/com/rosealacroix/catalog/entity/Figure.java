package com.rosealacroix.catalog.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the figure database table.
 * 
 */
@Entity
@NamedQuery(name="Figure.findAll", query="SELECT f FROM Figure f")
@DiscriminatorValue("figure")
public class Figure extends Content implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-many association to Generation
	@ManyToMany
	@JoinTable(
		name="belongs_to"
		, joinColumns={
			@JoinColumn(name="figure_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="generation_id")
			}
		)
	private List<Generation> generations;

	//bi-directional many-to-one association to Gender
	@ManyToOne
	@JoinColumn(name="gender_id")
	private Gender gender;

	//bi-directional many-to-many association to Content
	@ManyToMany
	@JoinTable(
		name="works_with"
		, joinColumns={
			@JoinColumn(name="figure_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="content_id")
			}
		)
	private List<Content> contentlist;

	public Figure() {
	}

	public List<Generation> getGenerations() {
		return this.generations;
	}

	public void setGenerations(List<Generation> generations) {
		this.generations = generations;
	}

	public Gender getGender() {
		return this.gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public List<Content> getContentList() {
		return this.contentlist;
	}

	public void setContentList(List<Content> contentlist) {
		this.contentlist = contentlist;
	}

}