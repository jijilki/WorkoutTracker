package com.workoutTracker.wt.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="workout_collection")
public class Workout {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name= "workout_id")
	private int workout_id;
	
	
	 @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "category_id", nullable = false)
	private Category  category;
	
	
	@Column( name ="workout_title")
	private String workout_title;
	
	@Column(name="workout_note")
	private String workout_note;
	
	@Column(name="calories_burn_per_min")
	private float cbpm;

	public int getWorkout_id() {
		return workout_id;
	}

	public void setWorkout_id(int workout_id) {
		this.workout_id = workout_id;
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

	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	
	
	
}
