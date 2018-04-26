package com.workoutTracker.wt.repo;

import org.springframework.data.repository.CrudRepository;

import com.workoutTracker.wt.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long >{

	public Iterable<Category> findAll();

} 
