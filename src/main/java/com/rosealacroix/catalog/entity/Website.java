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

	@NotEmpty(message = "Please enter the website''s name.")
	@Column(name="website_name")
	private String name;

	@NotEmpty(message = "Please enter the website''s URL.")
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
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Website)) {
			return false;
		}
		Website website = (Website) obj;
		return this.id !=null && this.id.equals(website.id);
	}
	
	public static Website valueOf(String id) {
		if (id == null || id.isEmpty()) {
			return null;
		}
		Long idLong = Long.valueOf(id);
		Website website = new Website();
		website.setId(idLong);
		return website;
	}

}