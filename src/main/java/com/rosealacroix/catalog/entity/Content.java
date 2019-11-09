package com.rosealacroix.catalog.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the content database table.
 * 
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@NamedQuery(name="Content.findAll", query="SELECT c FROM Content c")
@DiscriminatorColumn(name="discriminator_type")
@DiscriminatorValue("content")
public class Content implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="content_id")
	private Long id;

	@Column(name="content_isactive")
	private boolean active;

	@Column(name="content_name")
	private String name;

	@Column(name="content_sku")
	private String sku;

	@Column(name="content_url")
	private String url;

	//bi-directional many-to-one association to Type
	@ManyToOne
	@JoinColumn(name="type_id")
	private Type type;

	//bi-directional many-to-one association to Website
	@ManyToOne
	@JoinColumn(name="website_id")
	private Website website;

	//bi-directional many-to-many association to Software
	@ManyToMany(mappedBy="contents")
	private List<Software> softwares;

	//bi-directional many-to-many association to Creator
	@ManyToMany(mappedBy="contents")
	private List<Creator> creators;

	//bi-directional many-to-many association to Figure
	@ManyToMany(mappedBy="contents")
	private List<Figure> figures;

	public Content() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean getActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Website getWebsite() {
		return this.website;
	}

	public void setWebsite(Website website) {
		this.website = website;
	}

	public List<Software> getSoftwares() {
		return this.softwares;
	}

	public void setSoftwares(List<Software> softwares) {
		this.softwares = softwares;
	}

	public List<Creator> getCreators() {
		return this.creators;
	}

	public void setCreators(List<Creator> creators) {
		this.creators = creators;
	}

	public List<Figure> getFigures() {
		return this.figures;
	}

	public void setFigures(List<Figure> figures) {
		this.figures = figures;
	}

}