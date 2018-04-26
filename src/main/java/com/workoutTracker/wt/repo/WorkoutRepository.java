package com.workoutTracker.wt.repo;

import org.springframework.data.repository.CrudRepository;

import com.workoutTracker.wt.model.Workout;

public interface WorkoutRepository extends CrudRepository<Workout, Long> {

}
