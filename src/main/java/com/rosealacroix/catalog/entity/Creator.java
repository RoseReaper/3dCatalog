package com.rosealacroix.catalog.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


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

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Creator)) {
			return false;
		}
		Creator creator = (Creator) obj;
		return this.id !=null && this.id.equals(creator.id);
	}
	
	public static Creator valueOf(String id) {
		if (id == null || id.isEmpty()) {
			return null;
		}
		Long idLong = Long.valueOf(id);
		Creator creator = new Creator();
		creator.setId(idLong);
		return creator;
	}

}