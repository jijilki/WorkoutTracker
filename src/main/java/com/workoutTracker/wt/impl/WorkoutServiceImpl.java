package com.workoutTracker.wt.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.workoutTracker.wt.dao.WorkoutDao;
import com.workoutTracker.wt.intf.WorkoutServiceInterface;
import com.workoutTracker.wt.model.Category;
import com.workoutTracker.wt.model.Workout;
import com.workoutTracker.wt.request.CategoryRequest;
import com.workoutTracker.wt.request.WorkItemRequest;
import com.workoutTracker.wt.response.CategoryResponse;
import com.workoutTracker.wt.response.WorkItemResponse;


@Service
public class WorkoutServiceImpl implements WorkoutServiceInterface {

@Autowired
WorkoutDao	workoutDao;



public List<CategoryResponse> getAllCategories() {
	// TODO Auto-generated method stub
	System.out.println("Inside Impl");
	List<CategoryResponse> CategoryResponses = new ArrayList<CategoryResponse>();
	List<Category> categoryList=workoutDao.getAllCategories();
	
	for (Category category : categoryList) {
		CategoryResponse categoryResponse = new CategoryResponse();
		categoryResponse.set_catId(category.get_catId());
		categoryResponse.setCategoryName(category.getCategoryName());
		CategoryResponses.add(categoryResponse);
	}
	return CategoryResponses;
}

public String addCategory(CategoryRequest categoryRequest) {
	// TODO Auto-generated method stub
	System.out.println("Inside Impl:Add Category");
	
	Category category = new Category();
	category.set_catId(0);
	category.setCategoryName(categoryRequest.getCategoryName());
	return workoutDao.createCategory(category);
}

public String addWorkItem(WorkItemRequest workItemRequest) {
	// TODO Auto-generated method stub
	
	Workout workout = new Workout();
	List<Category> categoryList = workoutDao.getAllCategories();
	for (Category category : categoryList) {
		if(category.get_catId()== workItemRequest.getCategory().get_catId()){
			workout.setCategory(category);
			break;
		}
	}
	
	workout.setWorkout_title(workItemRequest.getWorkout_title());
	workout.setWorkout_note(workItemRequest.getWorkout_note());
	workout.setCbpm(workItemRequest.getCbpm());
	System.out.println(workItemRequest.getCategory().get_catId());
	if(workItemRequest.getWorkout_id()!=0){
		workout.setWorkout_id(workItemRequest.getWorkout_id());
	}


	return workoutDao.createWorkItem(workout);
}

public List<WorkItemResponse> getAllWorkItems() {
	
	System.out.println("Inside Impl");
	List<WorkItemResponse> workCategoryResponses = new ArrayList<WorkItemResponse>();
	List<Workout> workoutList=workoutDao.getAllWorkItem();
	
	for (Workout workout : workoutList) {
		WorkItemResponse workItemResponse = new WorkItemResponse();
		workItemResponse.setCategory(workout.getCategory());
		
		workItemResponse.setCbpm(workout.getCbpm());
		workItemResponse.setWorkout_id(workout.getWorkout_id());
		workItemResponse.setWorkout_note(workout.getWorkout_note());
		workItemResponse.setWorkout_title(workout.getWorkout_title());
		workCategoryResponses.add(workItemResponse);
	}
	return workCategoryResponses;
}

public String deleteCategory(CategoryRequest categoryRequest) {
	// TODO Auto-generated method stub
System.out.println("Inside Impl:Delete Category");
	
	Category category = new Category();
	category.set_catId(categoryRequest.get_catId());
	category.setCategoryName(categoryRequest.getCategoryName());
	return workoutDao.deleteCategory(category);	
}

public String updateCategory(CategoryRequest categoryRequest) {
	// TODO Auto-generated method stub
	// TODO Auto-generated method stub
		System.out.println("Inside Impl:Delete Category");
		Category category = new Category();
		category.set_catId(categoryRequest.get_catId());
		category.setCategoryName(categoryRequest.getCategoryName());
		return workoutDao.createCategory(category);
}

@Override
public String deleteWorkItem(WorkItemRequest workItemRequest) {
	
	return workoutDao.deleteWorkItem(workItemRequest.getWorkout_id());
}
	

}
