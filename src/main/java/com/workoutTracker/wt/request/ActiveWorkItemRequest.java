package com.workoutTracker.wt.request;

public class ActiveWorkItemRequest {
	
	private String start_date;
	private String start_time;
	private String end_date;
	private String end_time;
	private WorkItemRequest workout;
	
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	
	/**
	 * @return the start_date
	 */
	public String getStart_date() {
		return start_date;
	}
	/**
	 * @param start_date the start_date to set
	 */
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	/**
	 * @return the end_date
	 */
	public String getEnd_date() {
		return end_date;
	}
	/**
	 * @param end_date the end_date to set
	 */
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public WorkItemRequest getWorkout() {
		return workout;
	}
	public void setWorkout(WorkItemRequest workout) {
		this.workout = workout;
	}
	
	

}
