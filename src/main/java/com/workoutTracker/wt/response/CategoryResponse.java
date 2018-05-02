package com.workoutTracker.wt.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CategoryResponse {

	private int _catId;
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
