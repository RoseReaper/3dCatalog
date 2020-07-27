package com.rosealacroix.catalog.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * The persistent class for the content database table.
 * 
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@NamedQuery(name="Content.findAll", query="SELECT c FROM Content c")
public class Content implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="content_id")
	private Long id;

	@Column(name="content_isactive")
	private boolean active;

	@NotEmpty(message = "Please enter the content''s name.")
	@Column(name="content_name")
	private String name;

	@Column(name="content_sku")
	private String sku;

	@NotEmpty(message = "Please enter the content''s URL.")
	@Column(name="content_url")
	private String url;

	//bi-directional many-to-one association to Type
	@NotNull(message = "Please select the content''s type.")
	@ManyToOne
	@JoinColumn(name="type_id")
	private Type type;

	//bi-directional many-to-one association to Website
	@NotNull(message = "Please select one website.")
	@ManyToOne
	@JoinColumn(name="website_id")
	private Website website;

	//many-to-many association to Software
	@ManyToMany
	@JoinTable(
			name="is_compatible_with"
			, joinColumns={
				@JoinColumn(name="content_id")
				}
			, inverseJoinColumns={
				@JoinColumn(name="software_id")
				}
			)
	private List<Software> softwares;

	//many-to-many association to Creator
	@ManyToMany
	@JoinTable(
		name="is_made_by"
		, joinColumns={
			@JoinColumn(name="content_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="vendor_id")
			}
		)
	private List<Creator> creators;

	//bi-directional many-to-many association to Generation
	@ManyToMany
	@JoinTable(
		name="belongs_to"
		, joinColumns={
			@JoinColumn(name="content_id")
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
	
	public List<Generation> getGenerations() {
		return generations;
	}

	public void setGenerations(List<Generation> generations) {
		this.generations = generations;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}