package com.workoutTracker.wt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;



@Entity
@Table(name = "workout_category")
public class Category {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="category_id")
	private int _catId;
	
	@Column(name="category_name")
	private String categoryName;
	
	public int get_catId() {
		return _catId;
	}
	public void set_catId(int _catId) {
		this._catId = _catId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	
}
