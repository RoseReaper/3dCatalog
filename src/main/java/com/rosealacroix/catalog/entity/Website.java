package com.rosealacroix.catalog.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the website database table.
 * 
 */
@Entity
@NamedQuery(name="Website.findAll", query="SELECT w FROM Website w")
public class Website implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="website_id")
	private Long id;

	@Column(name="website_name")
	private String name;

	@Column(name="website_url")
	private String url;

	//bi-directional many-to-one association to Content
	@OneToMany(mappedBy="website")
	private List<Content> contents;

	public Website() {
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Content> getContents() {
		return this.contents;
	}

	public void setContents(List<Content> contents) {
		this.contents = contents;
	}

	public Content addContent(Content content) {
		getContents().add(content);
		content.setWebsite(this);

		return content;
	}

	public Content removeContent(Content content) {
		getContents().remove(content);
		content.setWebsite(null);

		return content;
	}

}