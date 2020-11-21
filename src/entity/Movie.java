package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue // Auto increment, Default is GenerationType.AUTO
	// @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String name;
	private String category;
	
	//toString
	public String toString() {
		return id + " - " + name + " - " + category;
	};

	// Getters e setters
	public Integer getId() {
		return id;
	};

	public void setId(Integer id) {
		this.id = id;
	};

	public String getName() {
		return name;
	};

	public void setName(String name) {
		this.name = name;
	};

	public String getCategory() {
		return category;
	};

	public void setCategory(String category) {
		this.category = category;
	};
		
}