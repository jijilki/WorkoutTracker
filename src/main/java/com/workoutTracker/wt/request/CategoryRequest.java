package com.workoutTracker.wt.request;

public class CategoryRequest {

	private String _catId;
	private String categoryName;
	public String get_catId() {
		return _catId;
	}
	public void set_catId(String _catId) {
		this._catId = _catId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
