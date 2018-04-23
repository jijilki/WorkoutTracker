package com.wt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.wt.model.Category;
import com.wt.repo.CategoryRepository;
import com.wt.services.intf.WorkoutServiceInterface;

public class WorkoutServiceImpl implements WorkoutServiceInterface{

@Autowired
private CategoryRepository categoryRepository;

	public String addCategory(Category category) {
		// TODO Auto-generated method stub
		categoryRepository.save(category);
		System.out.println("Saved");
		return "saved";
		
	}

}
