package com.rosealacroix.catalog.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the software database table.
 * 
 */
@Entity
@NamedQuery(name="Software.findAll", query="SELECT s FROM Software s")
public class Software implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="software_id")
	private Long id;

	@Column(name="software_name")
	private String name;

	//bi-directional many-to-many association to Content
	@ManyToMany
	@JoinTable(
		name="is_compatible_with"
		, joinColumns={
			@JoinColumn(name="software_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="content_id")
			}
		)
	private List<Content> contentlist;

	public Software() {
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

	public List<Content> getContentList() {
		return this.contentlist;
	}

	public void setContentList(List<Content> contentlist) {
		this.contentlist = contentlist;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Software)) {
			return false;
		}
		Software software = (Software) obj;
		return this.id !=null && this.id.equals(software.id);
	}
	
	public static Software valueOf(String id) {
		if (id == null || id.isEmpty()) {
			return null;
		}
		Long idLong = Long.valueOf(id);
		Software software = new Software();
		software.setId(idLong);
		return software;
	}

}