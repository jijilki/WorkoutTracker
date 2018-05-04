package com.workoutTracker.wt.repo;

import org.springframework.data.repository.CrudRepository;

import com.workoutTracker.wt.model.ActiveWorkout;

public interface ActiveWorkoutRepository extends CrudRepository<ActiveWorkout, Long> {

}
