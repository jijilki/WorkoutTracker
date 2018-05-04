package com.workoutTracker.wt.intf;

import java.util.List;

import org.springframework.stereotype.Service;

import com.workoutTracker.wt.model.ActiveWorkout;
import com.workoutTracker.wt.request.ActiveWorkItemRequest;
import com.workoutTracker.wt.request.CategoryRequest;
import com.workoutTracker.wt.request.WorkItemRequest;
import com.workoutTracker.wt.response.CategoryResponse;
import com.workoutTracker.wt.response.WorkItemResponse;

@Service
public interface WorkoutServiceInterface {

	public List<CategoryResponse> getAllCategories();



	public String addCategory(CategoryRequest categoryRequest);


	public List<WorkItemResponse> getAllWorkItems();
	
	public String addWorkItem(WorkItemRequest workITemRequest);



	public String deleteCategory(CategoryRequest categoryRequest);
	
	public String updateCategory(CategoryRequest categoryRequest);



	public String deleteWorkItem(WorkItemRequest workITemRequest);



	public String addActiveWorkItem(ActiveWorkItemRequest activeRequest);



	public List<ActiveWorkout> getActiveWorkouts();

}
