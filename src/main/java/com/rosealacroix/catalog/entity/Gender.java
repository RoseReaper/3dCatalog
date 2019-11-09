package com.rosealacroix.catalog.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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

	@Column(name="gender_name")
	private String name;

	//bi-directional many-to-one association to Figure
	@OneToMany(mappedBy="gender")
	private List<Figure> figures;

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

	public List<Figure> getFigures() {
		return this.figures;
	}

	public void setFigures(List<Figure> figures) {
		this.figures = figures;
	}

	public Figure addFigure(Figure figure) {
		getFigures().add(figure);
		figure.setGender(this);

		return figure;
	}

	public Figure removeFigure(Figure figure) {
		getFigures().remove(figure);
		figure.setGender(null);

		return figure;
	}

}