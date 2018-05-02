package com.workoutTracker.wt.request;

public class CategoryRequest {

	private int _catId;
	private String categoryName;
	
	
	/**
	 * @return the _catId
	 */
	public int get_catId() {
		return _catId;
	}
	/**
	 * @param _catId the _catId to set
	 */
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
