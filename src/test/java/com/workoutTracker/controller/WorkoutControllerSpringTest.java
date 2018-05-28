package com.workoutTracker.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.workoutTracker.wt.controller.WorkoutController;
import com.workoutTracker.wt.intf.WorkoutServiceInterface;

@RunWith(SpringJUnit4ClassRunner.class)
public class WorkoutControllerSpringTest {

	
	private MockMvc mockMvc;
	
	@InjectMocks
	private WorkoutController mockWorkoutController;
	
	@Mock
	private WorkoutServiceInterface mockWorkoutServiceIntf;
	
	@Before
	public void mockData(){
		
		mockMvc = MockMvcBuilders.standaloneSetup(mockWorkoutController).build();
		
	}
	
	@Test
	public void testGetWorkout() throws Exception{
		
		mockMvc.perform(get("/getWorkItems"))
			.andExpect(status().isOk());
		
	}
}
