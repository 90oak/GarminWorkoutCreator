package com.johnpickup.parser;

/**
 * Created by john on 03/01/2017.
 */
public enum PaceUnit {
    MIN_PER_MILE,
    MIN_PER_KILOMETRE,
    MILE_PER_HOUR,
    KILOMETRE_PER_HOUR;

    public static PaceUnit perDistanceUnit(DistanceUnit distanceUnit) {
        switch (distanceUnit) {
            case KILOMETRE:
                return MIN_PER_KILOMETRE;
            case MILE:
                return MIN_PER_MILE;
            default:
                return null;
        }
    }
}
