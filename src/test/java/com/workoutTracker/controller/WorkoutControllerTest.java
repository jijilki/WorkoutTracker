package com.workoutTracker.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.workoutTracker.wt.controller.WorkoutController;
import com.workoutTracker.wt.impl.WorkoutServiceImpl;
import com.workoutTracker.wt.intf.WorkoutServiceInterface;
import com.workoutTracker.wt.request.CategoryRequest;

import org.junit.Assert;

@RunWith(MockitoJUnitRunner.class)
public class WorkoutControllerTest{
	
	@InjectMocks
	WorkoutController workoutControllerMock;
	
	@Mock
	WorkoutServiceInterface workoutServMock;
	
	CategoryRequest categoryRequest = new CategoryRequest();
	
	@Before
	public void mockData (){
		// TODO Auto-generated constructor stub
		categoryRequest.setCategoryName("Yoga");
		
	}
	
	
	@Test
	public void testCreateCategory(){
		Mockito.when(workoutServMock.addCategory(Matchers.any(CategoryRequest.class))).thenReturn("success");
		Assert.assertEquals("success", workoutControllerMock.addCategory(categoryRequest));
	
	}
	
	
	
	
	
	
	
	
}