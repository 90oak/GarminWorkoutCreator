package com.johnpickup.converter;

import com.johnpickup.garmin.unit.Distance;
import com.johnpickup.garmin.workout.SimpleDistanceWorkoutStep;
import com.johnpickup.garmin.workout.WorkoutStep;
import com.johnpickup.parser.DistanceStep;
import com.johnpickup.parser.Step;

/**
 * Created by john on 09/01/2017.
 */
public class DistanceStepConverter implements StepConverter {
    @Override
    public WorkoutStep convert(Step step) {
        DistanceStep distanceStep = (DistanceStep)step;

        Distance d = new Distance(
                distanceStep.getDistance().getQuantity(),
                DiatanceUnitConverter.convert(distanceStep.getDistance().getUnit()));
        SimpleDistanceWorkoutStep simpleDistanceWorkoutStep = new SimpleDistanceWorkoutStep(d);
        return simpleDistanceWorkoutStep;
    }
}