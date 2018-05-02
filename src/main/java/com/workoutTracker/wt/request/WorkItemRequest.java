package com.workoutTracker.wt.request;




public class WorkItemRequest {
	
	private CategoryRequest  category;
	
	private String workout_title;

	private String workout_note;
	
	private float cbpm;
	
	private int workout_id;

	/**
	 * @return the category
	 */
	public CategoryRequest getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(CategoryRequest category) {
		this.category = category;
	}

	/**
	 * @return the workout_title
	 */
	public String getWorkout_title() {
		return workout_title;
	}

	/**
	 * @param workout_title the workout_title to set
	 */
	public void setWorkout_title(String workout_title) {
		this.workout_title = workout_title;
	}

	/**
	 * @return the workout_note
	 */
	public String getWorkout_note() {
		return workout_note;
	}

	/**
	 * @param workout_note the workout_note to set
	 */
	public void setWorkout_note(String workout_note) {
		this.workout_note = workout_note;
	}

	/**
	 * @return the cbpm
	 */
	public float getCbpm() {
		return cbpm;
	}

	/**
	 * @param cbpm the cbpm to set
	 */
	public void setCbpm(float cbpm) {
		this.cbpm = cbpm;
	}

	/**
	 * @return the workout_id
	 */
	public int getWorkout_id() {
		return workout_id;
	}

	/**
	 * @param workout_id the workout_id to set
	 */
	public void setWorkout_id(int workout_id) {
		this.workout_id = workout_id;
	}

	
	
	
	
	


}
