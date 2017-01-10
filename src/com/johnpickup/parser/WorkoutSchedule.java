package com.johnpickup.parser;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * Class that contains all the elements required to build a series of workouts and schedule them
 */
@EqualsAndHashCode
@ToString
public class WorkoutSchedule {
    @Getter
    private Map<String, Workout> workouts = new HashMap<>();
    @Getter
    private Map<String, Pace> paces = new HashMap<>();
}
