package com.workoutTracker.wt.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.workoutTracker.wt.model.Category;
import com.workoutTracker.wt.model.Workout;
import com.workoutTracker.wt.repo.CategoryRepository;
import com.workoutTracker.wt.repo.WorkoutRepository;
@Component
public class WorkoutDao {

@Autowired
CategoryRepository categoryRepository;

@Autowired
WorkoutRepository workoutRepository;



	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		List<Category> catList = new ArrayList<Category>();
		Iterable<Category> categorylist= categoryRepository.findAll();
		catList.addAll((Collection<? extends Category>) categorylist);
		return catList;
	}

	public String createCategory(Category category) {
		// TODO Auto-generated method stub
		categoryRepository.save(category);
		return "Success";
	}

	public List<Workout> getAllWorkItem() {
		// TODO Auto-generated method stub
		List<Workout> workList = new ArrayList<Workout>();
		Iterable<Workout> workOutList= workoutRepository.findAll();
		workList.addAll((Collection<? extends Workout>) workOutList);
		return workList;
	}
	
	public String createWorkItem(Workout workout) {
		// TODO Auto-generated method stub
		workoutRepository.save(workout);
		return "Success";
	}

	public String deleteCategory(Category category) {
		// TODO Auto-generated method stub
		categoryRepository.delete(category);
		return "Success";
	}


}
