package com.workoutTracker.wt.response;

import com.workoutTracker.wt.model.Category;

public class WorkItemResponse {
	

	private int workout_id;
	
	private Category  category;
	
	private String workout_title;
	
	private String workout_note;
	
	private float cbpm;

	public int getWorkout_id() {
		return workout_id;
	}

	public void setWorkout_id(int workout_id) {
		this.workout_id = workout_id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getWorkout_title() {
		return workout_title;
	}

	public void setWorkout_title(String workout_title) {
		this.workout_title = workout_title;
	}

	public String getWorkout_note() {
		return workout_note;
	}

	public void setWorkout_note(String workout_note) {
		this.workout_note = workout_note;
	}

	public float getCbpm() {
		return cbpm;
	}

	public void setCbpm(float cbpm) {
		this.cbpm = cbpm;
	}

	
	
}
