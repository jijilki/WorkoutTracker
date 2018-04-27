package com.workoutTracker.wt.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.workoutTracker.wt.intf.WorkoutServiceInterface;
import com.workoutTracker.wt.request.CategoryRequest;
import com.workoutTracker.wt.request.WorkItemRequest;
import com.workoutTracker.wt.response.CategoryResponse;
import com.workoutTracker.wt.response.WorkItemResponse;

@CrossOrigin(origins="*")
@RestController
public class WorkoutController {
	
	
	@Autowired
	WorkoutServiceInterface workoutServiceInterface;
	
	@RequestMapping(path="/getCategories",method=RequestMethod.GET)
	public List<CategoryResponse> getAllCategories(){
		System.out.print("Inside Controller");
		return workoutServiceInterface.getAllCategories();
		
	}
	
	@RequestMapping(path="/addCategory",method=RequestMethod.POST)
	public String addCategory(@RequestBody CategoryRequest categoryRequest){
		System.out.print("Inside Controller");
		return workoutServiceInterface.addCategory(categoryRequest);
		
	}
	
	@RequestMapping(path="/deleteCategory",method=RequestMethod.POST)
	public String deleteCategory(@RequestBody CategoryRequest categoryRequest){
		System.out.print("Inside Controller");
		return workoutServiceInterface.deleteCategory(categoryRequest);
		
	}
	
	@RequestMapping(path="/updateCategory",method=RequestMethod.POST)
	public String updateCategory(@RequestBody CategoryRequest categoryRequest){
		System.out.print("Inside Controller");
		return workoutServiceInterface.updateCategory(categoryRequest);
		
	}
	
	
	@RequestMapping(path="/getWorkItems",method=RequestMethod.GET)
	public List<WorkItemResponse> getAllWorkItems(){
		System.out.print("Inside Controller");
		return workoutServiceInterface.getAllWorkItems();
		
	}
	
	@RequestMapping(path="/addWorkItem",method=RequestMethod.POST)
	public String addWorkItem(@RequestBody WorkItemRequest workITemRequest){
		return workoutServiceInterface.addWorkItem(workITemRequest);
	}
	
	

}
