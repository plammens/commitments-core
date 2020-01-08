package com.mathdump.commitments.utils;

/**
 * Represents a metric (a certain measurement).
 */
public class Metric {

    private final String definition;
    private final String unit;

    public Metric(String definition, String unit) {
        this.definition = definition;
        this.unit = unit;
    }

    public String getDefinition() {
        return definition;
    }

    public String getUnit() {
        return unit;
    }

}
