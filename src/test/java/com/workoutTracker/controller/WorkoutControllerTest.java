package com.workoutTracker.controller;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.mock.web.MockHttpServletRequest;

import static org.junit.Assert.assertEquals;

import com.workoutTracker.wt.controller.WorkoutController;
import com.workoutTracker.wt.dao.WorkoutDao;
import com.workoutTracker.wt.impl.WorkoutServiceImpl;
import com.workoutTracker.wt.intf.WorkoutServiceInterface;
import com.workoutTracker.wt.model.Category;
import com.workoutTracker.wt.request.CategoryRequest;

@SuppressWarnings("deprecation")
@RunWith(MockitoJUnitRunner.class)
public class WorkoutControllerTest {
	
	@InjectMocks
	WorkoutController workoutControllerMock;
	
	@InjectMocks
	WorkoutServiceImpl workoutServiceImplMock;
	
	@InjectMocks
	WorkoutDao workoutDaoMock;
	
	CategoryRequest catRequest;
	
	Category cat;
	
	String status;
	@Before
	public void mockData(){
		
		catRequest = new CategoryRequest();
		catRequest.setCategoryName("AAA");
	//	cat.setCategoryName(catRequest.getCategoryName());
		}
	
	@Test
	public void testAddCategory(){
		Mockito.when(workoutServiceImplMock.addCategory(catRequest)).thenReturn(status);
		Mockito.when(workoutDaoMock.createCategory(cat)).thenReturn(status);
		//assertEquals(status,"Success");
		assertEquals(status, workoutControllerMock.addCategory(catRequest));
	}

}
