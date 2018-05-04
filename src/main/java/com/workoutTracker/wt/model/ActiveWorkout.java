package com.workoutTracker.wt.model;

import java.sql.Date;
import java.sql.Time;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "workout_active")
public class ActiveWorkout {
	
	@ManyToOne
	@JoinColumn(name="workout_id", nullable = false)
	private Workout workout;
	
	@Id
	@Column(name="active_workout_id")
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int active_workout_id;
	
	@Column(name="start_time")
	private Time  start_time;
	
	@Column(name="end_time")
	private Time end_time;
	@Column(name="start_date")
	private Date start_date;
	@Column(name="end_date")
	private Date end_date;
	@Column(name="comment")
	private String comment;
	@Column(name="status")
	private String status;
	public Workout getWorkout() {
		return workout;
	}
	public void setWorkout(Workout workout) {
		this.workout = workout;
	}
	public Time getStart_time() {
		return start_time;
	}
	public void setStart_time(Time start_time) {
		this.start_time = start_time;
	}
	public Time getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Time end_time) {
		this.end_time = end_time;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date date) {
		this.start_date = (Date) date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date date) {
		this.end_date =  date;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
