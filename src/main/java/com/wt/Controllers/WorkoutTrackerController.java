package com.wt.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wt.model.Category;
import com.wt.services.intf.WorkoutServiceInterface;




@RestController
public class WorkoutTrackerController {
	
	
	@Autowired
	WorkoutServiceInterface workoutSeviceInterface;
	
	@RequestMapping(value="/addcategory",method=RequestMethod.POST)
	public void addCategory(@RequestBody Category category){
		System.out.println("Inside Controller");
		workoutSeviceInterface.addCategory(category);

	}

}
